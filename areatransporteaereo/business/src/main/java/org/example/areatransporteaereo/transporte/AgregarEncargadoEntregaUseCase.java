package org.example.areatransporteaereo.transporte;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.areatransporteaereo.transporte.command.AgregarEncargadoEntregaCommand;

public class AgregarEncargadoEntregaUseCase extends UseCase<RequestCommand<AgregarEncargadoEntregaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarEncargadoEntregaCommand> input) {
        var command = input.getCommand();
        var transporte = Transporte.from(
                command.getTransporteId(),
                repository().getEventsBy(command.getTransporteId().value())
        );
        transporte.agregarEncargadoEntrega(
                command.getEntityId(),
                command.getNombreEncargado(),
                command.getTelefono()
        );
        emit().onResponse(new ResponseEvents(transporte.getUncommittedChanges()));
    }
}
