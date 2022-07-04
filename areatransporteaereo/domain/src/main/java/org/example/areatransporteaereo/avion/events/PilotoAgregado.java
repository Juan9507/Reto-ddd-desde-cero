package org.example.areatransporteaereo.avion.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.values.Licencia;
import org.example.areatransporteaereo.avion.values.Nombre;
import org.example.areatransporteaereo.avion.values.PilotoId;

public class PilotoAgregado extends DomainEvent {
    private final PilotoId entityId;
    private final Licencia licencia;
    private final Nombre nombre;

    public PilotoAgregado(PilotoId entityId, Licencia licencia, Nombre nombre) {
        super("org.example.areatransporteaereo.avion.PilotoAgregado");
        this.entityId = entityId;
        this.licencia = licencia;
        this.nombre = nombre;
    }

    public PilotoId getEntityId() {
        return entityId;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
