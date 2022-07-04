package org.example.areatransporteaereo.mercancia;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.areatransporteaereo.mercancia.commands.CrearMercanciaCommand;

public class CrearMercanciaUseCase extends UseCase<RequestCommand<CrearMercanciaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearMercanciaCommand> crearMercanciaCommandRequestCommand) {
        var command = crearMercanciaCommandRequestCommand.getCommand();
        var mercancia = new Mercancia(
                command.getMercanciaId(),
                command.getFechaCreacion()
        );
        emit().onResponse(new ResponseEvents(mercancia.getUncommittedChanges()));
    }
}
