package org.example.areatransporteaereo.mercancia;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.commands.AgregarRemitenteCommand;
import org.example.areatransporteaereo.mercancia.events.MercanciaCreada;
import org.example.areatransporteaereo.mercancia.events.RemitenteAgregado;
import org.example.areatransporteaereo.mercancia.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AgregarRemitenteUseCaseTest {

    @InjectMocks
    AgregarRemitenteUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void agregarRemitente(){
        //arrange
        MercanciaId mercanciaId = MercanciaId.of("xxxx");
        RemitenteId remitenteId = RemitenteId.of("vvvv");
        Nombre nombre = new Nombre("jose", "perez");
        Identidad identidad = new Identidad(TipoIdentidad.CC,"22333");
        Destinario destinario = new Destinario(
                new DatosPersona("Carlos frio","calle 344"),
                new Pais("23","colombia")
        );
        var command = new AgregarRemitenteCommand(
                mercanciaId,
                remitenteId,
                nombre,
                identidad,
                destinario
        );
        when(repository.getEventsBy("xxxx")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (RemitenteAgregado) events.get(0);
        Assertions.assertEquals("calle 344",event.getDestinario().value().datosPersona().value().direccion());
    }

    private List<DomainEvent> history() {
        return List.of(new MercanciaCreada(
                new FechaCreacion()
        ));
    }

}