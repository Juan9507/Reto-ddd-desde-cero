package org.example.areatransporteaereo.mercancia;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.commands.AgregarClasificacionCommand;
import org.example.areatransporteaereo.mercancia.events.ClasificacionAgregada;
import org.example.areatransporteaereo.mercancia.events.MercanciaCreada;
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
class AgregarClasificacionUseCaseTest {

    @InjectMocks
    AgregarClasificacionUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void AgregarClasificacion(){
        //arrange
        MercanciaId mercanciaId = MercanciaId.of("eee");
        ClasificacionId clasificacionId = ClasificacionId.of("dddd");
        Descripcion descripcion = new Descripcion("Peligroso");
        TipoDeMercancia tipoDeMercancia = new TipoDeMercancia(
                "pesado",
                "tecnologico"
        );
        var command = new AgregarClasificacionCommand(
                mercanciaId,
                clasificacionId,
                descripcion,
                tipoDeMercancia
        );
        when(repository.getEventsBy("eee")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (ClasificacionAgregada) events.get(0);
        Assertions.assertEquals("dddd",event.getEntityId().value());

    }

    private List<DomainEvent> history() {
        return List.of(new MercanciaCreada(
                new FechaCreacion()
        ));
    }

}