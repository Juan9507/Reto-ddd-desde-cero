package org.example.areatransporteaereo.mercancia;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.commands.AgregarOperacionMercanciaCommand;
import org.example.areatransporteaereo.mercancia.events.MercanciaCreada;
import org.example.areatransporteaereo.mercancia.events.OperacionMercanciaAgregada;
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
class AgregarOperacionMercanciaUseCaseTest {

    @InjectMocks
    AgregarOperacionMercanciaUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void agregarOperacionMercancia(){
        //arrange
        MercanciaId mercanciaId = MercanciaId.of("xxxx");
        OperacionId operacionId = OperacionId.of("zzzz");
        ImportacionExportacion importacionExportacion = new ImportacionExportacion(
                TipoImportacion.IMPORTACION
        );
        var command = new AgregarOperacionMercanciaCommand(
                mercanciaId,
                operacionId,
                importacionExportacion
        );
        when(repository.getEventsBy("xxxx")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (OperacionMercanciaAgregada) events.get(0);
        Assertions.assertEquals("IMPORTACION",event.getImportacionExportacion().value().toString());

    }

    private List<DomainEvent> history() {
        return List.of(new MercanciaCreada(
                new FechaCreacion()
        ));
    }
}