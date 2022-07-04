package org.example.areatransporteaereo.transporte;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.events.AvionCreado;
import org.example.areatransporteaereo.avion.values.AvionId;
import org.example.areatransporteaereo.avion.values.TipoDeAvion;
import org.example.areatransporteaereo.avion.values.TipoDeFuncion;
import org.example.areatransporteaereo.transporte.command.CrearTransporteCommand;
import org.example.areatransporteaereo.transporte.events.TransporteCreado;
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
class CrearTransporteUseCaseTest {

    @InjectMocks
    CrearTransporteUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void crearTransporte(){
        //arrange
        TransporteId transporteId = TransporteId.of("cod");
        AvionId avionId = AvionId.of("xxxx");
        var command = new CrearTransporteCommand(transporteId,avionId);
        //when(repository.getEventsBy("cod")).thenReturn(history());
        //useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (TransporteCreado) events.get(0);
        Assertions.assertEquals("xxxx",event.getAvionId().value());
    }

    /*private List<DomainEvent> history() {
        return List.of(new AvionCreado(
                new TipoDeAvion("Avion grande", TipoDeFuncion.CARGA)
        ));
    }*/

}