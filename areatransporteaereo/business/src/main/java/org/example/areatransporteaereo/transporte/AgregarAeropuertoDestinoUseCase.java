package org.example.areatransporteaereo.transporte;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.areatransporteaereo.transporte.command.AgregarAeropuertoDestinoCommand;

public class AgregarAeropuertoDestinoUseCase extends UseCase<RequestCommand<AgregarAeropuertoDestinoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarAeropuertoDestinoCommand> input) {
        var command = input.getCommand();
        var transporte = Transporte.from(
                command.getTransporteId(),
                repository().getEventsBy(command.getTransporteId().value())
        );
        transporte.agregarAeropuertoDestino(
                command.getAeropuertoDestinoIdId(),
                command.getCodigoIcao(),
                command.getNombreAeropuerto(),
                command.getPais()
        );
        emit().onResponse(new ResponseEvents(transporte.getUncommittedChanges()));
    }
}
