package org.example.areatransporteaereo.transporte.command;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.avion.values.AvionId;
import org.example.areatransporteaereo.transporte.values.TransporteId;

public class CrearTransporteCommand extends Command {

    private final TransporteId entityId;
    private final AvionId avionId;

    public CrearTransporteCommand(TransporteId entityId, AvionId avionId){

        this.entityId = entityId;
        this.avionId = avionId;
    }

    public TransporteId getEntityId() {
        return entityId;
    }

    public AvionId getAvionId() {
        return avionId;
    }
}
