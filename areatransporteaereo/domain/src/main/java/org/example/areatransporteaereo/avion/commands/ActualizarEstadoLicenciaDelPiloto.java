package org.example.areatransporteaereo.avion.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.avion.values.AvionId;
import org.example.areatransporteaereo.avion.values.Estado;
import org.example.areatransporteaereo.avion.values.PilotoId;

public class ActualizarEstadoLicenciaDelPiloto extends Command {

    private final AvionId avionId;
    private final PilotoId entityId;
    private final Estado estado;

    public ActualizarEstadoLicenciaDelPiloto(AvionId avionId, PilotoId entityId, Estado estado){

        this.avionId = avionId;
        this.entityId = entityId;
        this.estado = estado;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public PilotoId getEntityId() {
        return entityId;
    }

    public Estado getEstado() {
        return estado;
    }
}
