package org.example.areatransporteaereo.mercancia;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.areatransporteaereo.mercancia.commands.AgregarOperacionMercanciaCommand;

public class AgregarOperacionMercanciaUseCase extends UseCase<RequestCommand<AgregarOperacionMercanciaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarOperacionMercanciaCommand> input) {
        var command = input.getCommand();
        var mercancia = Mercancia.from(
                command.getMercanciaId(),
                repository().getEventsBy(command.getMercanciaId().value())
        );
        mercancia.agregarOperacionMercancia(
                command.getEntityId(),
                command.getImportacionExportacion()
        );
        emit().onResponse(new ResponseEvents(mercancia.getUncommittedChanges()));
    }
}
