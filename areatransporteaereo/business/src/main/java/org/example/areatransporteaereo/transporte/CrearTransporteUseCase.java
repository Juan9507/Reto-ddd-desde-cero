package org.example.areatransporteaereo.transporte;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.areatransporteaereo.transporte.command.CrearTransporteCommand;

public class CrearTransporteUseCase extends UseCase<RequestCommand<CrearTransporteCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearTransporteCommand> crearTransporteCommandRequestCommand) {
        var command = crearTransporteCommandRequestCommand.getCommand();
        var transporte = new Transporte(
                command.getEntityId(),
                command.getAvionId()
        );

        emit().onResponse(new ResponseEvents(transporte.getUncommittedChanges()));
    }
}
