package org.example.areatransporteaereo.avion.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.avion.values.AvionId;
import org.example.areatransporteaereo.avion.values.Nombre;
import org.example.areatransporteaereo.avion.values.PilotoId;

public class ActualizarNombrePiloto extends Command {

    private final AvionId avionId;
    private final PilotoId entityId;
    private final Nombre nombre;

    public ActualizarNombrePiloto(AvionId avionId, PilotoId entityId, Nombre nombre){

        this.avionId = avionId;
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public PilotoId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
