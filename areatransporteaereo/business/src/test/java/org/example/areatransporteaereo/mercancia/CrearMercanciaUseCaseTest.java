package org.example.areatransporteaereo.mercancia;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.example.areatransporteaereo.mercancia.commands.CrearMercanciaCommand;
import org.example.areatransporteaereo.mercancia.events.MercanciaCreada;
import org.example.areatransporteaereo.mercancia.values.FechaCreacion;
import org.example.areatransporteaereo.mercancia.values.MercanciaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CrearMercanciaUseCaseTest {

    @InjectMocks
    CrearMercanciaUseCase useCase;
    @Test
    public void crearMercancia(){
        //arrange
        MercanciaId mercanciaId = MercanciaId.of("uuu");
        FechaCreacion fechaCreacion = new FechaCreacion();
        var command = new CrearMercanciaCommand(mercanciaId,fechaCreacion);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (MercanciaCreada) events.get(0);
        Assertions.assertEquals(new Date().toString(), event.getFechaCreacion().value());
    }

}