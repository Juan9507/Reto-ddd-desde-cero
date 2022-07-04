package org.example.areatransporteaereo.avion;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.commands.AgregarContenedorCommand;
import org.example.areatransporteaereo.avion.events.AvionCreado;
import org.example.areatransporteaereo.avion.events.ContenedorAgregado;
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
class AgregarContenedorUseCaseTest {

    @InjectMocks
    AgregarContenedorUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void agregarcontenedor(){
        //arrange
        AvionId avionId = AvionId.of("www");
        ContenedorId contenedorId = ContenedorId.of("fff");
        CargaMaxima cargaMaxima = new CargaMaxima(new Peso("kg",45));
        Longitud longitud = new Longitud(23,44,55);
        Peso peso = new Peso("fragil",23);
        var command = new AgregarContenedorCommand(
                avionId,
                contenedorId,
                cargaMaxima,
                longitud,peso
        );
        when(repository.getEventsBy("www")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (ContenedorAgregado) events.get(0);
        Assertions.assertEquals(45,event.getCargaMaxima().value().value().peso());
    }

    private List<DomainEvent> history() {
        return List.of(new AvionCreado(
                new TipoDeAvion("Avion grande", TipoDeFuncion.CARGA)
        ));
    }

}