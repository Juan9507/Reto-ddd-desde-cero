package org.example.areatransporteaereo.avion;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.areatransporteaereo.avion.commands.CrearAvionCommand;

public class CrearAvionUseCase extends UseCase<RequestCommand<CrearAvionCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearAvionCommand> crearAvionCommandRequestCommand) {
        var command = crearAvionCommandRequestCommand.getCommand();
        var avion = new Avion(
                command.getAvionId(),
                command.getTipoDeAvion()
        );

        emit().onResponse(new ResponseEvents(avion.getUncommittedChanges()));

    }
}
