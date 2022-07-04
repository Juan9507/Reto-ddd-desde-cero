package org.example.areatransporteaereo.avion.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.values.Nombre;
import org.example.areatransporteaereo.avion.values.PilotoId;

public class NombreDelPilotoActualizado extends DomainEvent {
    private final PilotoId entityId;
    private final Nombre nombre;

    public NombreDelPilotoActualizado(PilotoId entityId, Nombre nombre) {
        super("org.example.areatransporteaereo.avion.NombreDelPilotoActualizado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public PilotoId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
