package org.example.areatransporteaereo.transporte;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.values.AvionId;
import org.example.areatransporteaereo.transporte.command.AgregarEncargadoEntregaCommand;
import org.example.areatransporteaereo.transporte.events.EncargadoEntregaAgregado;
import org.example.areatransporteaereo.transporte.events.TransporteCreado;
import org.example.areatransporteaereo.transporte.values.EncargadoEntregaId;
import org.example.areatransporteaereo.transporte.values.NombreEncargado;
import org.example.areatransporteaereo.transporte.values.Telefono;
import org.example.areatransporteaereo.transporte.values.TransporteId;
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
class AgregarEncargadoEntregaUseCaseTest {

    @InjectMocks
    AgregarEncargadoEntregaUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void agregarEncargadoEntrega(){
        //arrange
        TransporteId transporteId = TransporteId.of("xxxx");
        EncargadoEntregaId encargadoEntregaId = EncargadoEntregaId.of("jjjj");
        NombreEncargado nombreEncargado = new NombreEncargado("Juan","Rivera");
        Telefono telefono = new Telefono("43E",23456);
        var command = new AgregarEncargadoEntregaCommand(
                transporteId,
                encargadoEntregaId,
                nombreEncargado,
                telefono
        );
        when(repository.getEventsBy("xxxx")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (EncargadoEntregaAgregado) events.get(0);
        Assertions.assertEquals("Juan",event.getNombreEncargado().value().nombre());
        Assertions.assertEquals(23456,event.getTelefono().value().numero());
    }

    private List<DomainEvent> history() {
        return List.of(new TransporteCreado(
                new AvionId("vvvv")
        ));
    }

}