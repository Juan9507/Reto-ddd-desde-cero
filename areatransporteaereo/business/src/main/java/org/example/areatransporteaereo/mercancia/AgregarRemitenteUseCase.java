package org.example.areatransporteaereo.mercancia;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.areatransporteaereo.mercancia.commands.AgregarRemitenteCommand;

public class AgregarRemitenteUseCase extends UseCase<RequestCommand<AgregarRemitenteCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarRemitenteCommand> input) {
        var command = input.getCommand();
        var mercancia = Mercancia.from(
                command.getMercanciaId(),
                repository().getEventsBy(command.getMercanciaId().value())
        );
        mercancia.agregarRemitente(
                command.getEntityId(),
                command.getNombre(),
                command.getIdentidad(),
                command.getDestinario()
        );
        emit().onResponse(new ResponseEvents(mercancia.getUncommittedChanges()));
    }
}
