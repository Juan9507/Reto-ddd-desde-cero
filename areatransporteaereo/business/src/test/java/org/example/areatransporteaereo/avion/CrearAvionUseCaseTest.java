package org.example.areatransporteaereo.avion;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.example.areatransporteaereo.avion.commands.CrearAvionCommand;
import org.example.areatransporteaereo.avion.events.AvionCreado;
import org.example.areatransporteaereo.avion.values.AvionId;
import org.example.areatransporteaereo.avion.values.TipoDeAvion;
import org.example.areatransporteaereo.avion.values.TipoDeFuncion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CrearAvionUseCaseTest {

    @InjectMocks
    CrearAvionUseCase useCase;

    @Test
    public void crearAvion() {
        //arrange
        AvionId avionId = AvionId.of("fff");
        var tipoDeFuncion = TipoDeFuncion.CARGA;
        TipoDeAvion tipoDeAvion = new TipoDeAvion("avion privado", tipoDeFuncion);
        var command = new CrearAvionCommand(avionId, tipoDeAvion);
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (AvionCreado) events.get(0);
        Assertions.assertEquals("CARGA", event.getTipoDeAvion().value().tipoDeFuncion().toString());
    }

}