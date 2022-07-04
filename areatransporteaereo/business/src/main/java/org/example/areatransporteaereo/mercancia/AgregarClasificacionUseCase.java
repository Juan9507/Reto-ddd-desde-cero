package org.example.areatransporteaereo.mercancia;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.areatransporteaereo.mercancia.commands.AgregarClasificacionCommand;

public class AgregarClasificacionUseCase extends UseCase<RequestCommand<AgregarClasificacionCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarClasificacionCommand> input) {
        var command = input.getCommand();
        var mercancia = Mercancia.from(
                command.getMercanciaId(),
                repository().getEventsBy(command.getMercanciaId().value())
        );
        mercancia.agregarClasificacion(
                command.getEntityId(),
                command.getDescripcion(),
                command.getTipoDeMercancia()
        );
        emit().onResponse(new ResponseEvents(mercancia.getUncommittedChanges()));
    }
}
