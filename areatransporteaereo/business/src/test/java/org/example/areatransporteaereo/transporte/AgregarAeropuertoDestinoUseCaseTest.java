package org.example.areatransporteaereo.transporte;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.values.AvionId;
import org.example.areatransporteaereo.mercancia.events.MercanciaCreada;
import org.example.areatransporteaereo.mercancia.values.FechaCreacion;
import org.example.areatransporteaereo.mercancia.values.Pais;
import org.example.areatransporteaereo.transporte.command.AgregarAeropuertoDestinoCommand;
import org.example.areatransporteaereo.transporte.events.AeropuertoDestinoAgregado;
import org.example.areatransporteaereo.transporte.events.TransporteCreado;
import org.example.areatransporteaereo.transporte.values.AeropuertoDestinoId;
import org.example.areatransporteaereo.transporte.values.CodigoIcao;
import org.example.areatransporteaereo.transporte.values.NombreAeropuerto;
import org.example.areatransporteaereo.transporte.values.TransporteId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AgregarAeropuertoDestinoUseCaseTest {

    @InjectMocks
    AgregarAeropuertoDestinoUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void agregarAeropuertoDestino(){
        //arrange
        TransporteId transporteId = TransporteId.of("xxxx");
        AeropuertoDestinoId aeropuertoDestinoId = AeropuertoDestinoId.of("cccc");
        CodigoIcao codigoIcao = new CodigoIcao(23);
        NombreAeropuerto nombreAeropuerto = new NombreAeropuerto("usa");
        Pais pais = new Pais("345","Estados unidos");
        var command = new AgregarAeropuertoDestinoCommand(
                transporteId,
                aeropuertoDestinoId,
                codigoIcao,
                nombreAeropuerto,
                pais
        );
        when(repository.getEventsBy("xxxx")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (AeropuertoDestinoAgregado) events.get(0);
        Assertions.assertEquals("usa", event.getNombreAeropuerto().value());

    }

    private List<DomainEvent> history() {
        return List.of(new TransporteCreado(
                new AvionId("ccc")
        ));
    }

}