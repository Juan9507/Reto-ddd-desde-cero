package org.example.areatransporteaereo.avion;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.areatransporteaereo.avion.commands.AgregarPilotoCommand;

public class AgregarPilotoUseCase extends UseCase<RequestCommand<AgregarPilotoCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarPilotoCommand> input) {
        var command  = input.getCommand();
        var avion = Avion.from(
                command.getAvionId(),
                repository().getEventsBy(command.getAvionId().value())
        );

        avion.agregarPiloto(command.getEntityId(),command.getLicencia(),command.getNombre());

        emit().onResponse(new ResponseEvents(avion.getUncommittedChanges()));

    }
}
