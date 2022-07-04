package org.example.areatransporteaereo.avion;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.areatransporteaereo.avion.commands.AgregarContenedorCommand;

public class AgregarContenedorUseCase extends UseCase<RequestCommand<AgregarContenedorCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarContenedorCommand> input) {
        var command = input.getCommand();
        var avion = Avion.from(
                command.getAvionId(),
                repository().getEventsBy(command.getAvionId().value())
        );
        avion.agregarContenedor(
                command.getContenedorId(),
                command.getCargaMaxima(),
                command.getLongitud(),
                command.getPeso()
        );

        emit().onResponse(new ResponseEvents(avion.getUncommittedChanges()));
    }
}
