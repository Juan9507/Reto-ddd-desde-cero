package org.example.areatransporteaereo.avion;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.commands.AgregarPilotoCommand;
import org.example.areatransporteaereo.avion.events.AvionCreado;
import org.example.areatransporteaereo.avion.events.PilotoAgregado;
import org.example.areatransporteaereo.avion.values.*;
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
class AgregarPilotoUseCaseTest {

    @InjectMocks
    AgregarPilotoUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void AgregarPiloto() {
        //arrange
        AvionId avionId = AvionId.of("ddd");
        PilotoId pilotoId = PilotoId.of("ccc");
        Nombre nombre = new Nombre("Juan", "Rivera");
        Licencia licencia = new Licencia(nombre, Estado.ACTIVO);
        var command = new AgregarPilotoCommand(avionId,pilotoId,licencia,nombre);
        when(repository.getEventsBy("ddd")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (PilotoAgregado) events.get(0);
        Assertions.assertEquals("Juan",event.getNombre().value().nombre());
    }

    private List<DomainEvent> history() {
        return List.of(new AvionCreado(
                new TipoDeAvion("Avion grande", TipoDeFuncion.CARGA)
        ));
    }
}