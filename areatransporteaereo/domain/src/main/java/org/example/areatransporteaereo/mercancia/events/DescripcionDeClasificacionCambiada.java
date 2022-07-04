package org.example.areatransporteaereo.mercancia.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.values.ClasificacionId;
import org.example.areatransporteaereo.mercancia.values.Descripcion;

public class DescripcionDeClasificacionCambiada extends DomainEvent {
    private final ClasificacionId entityId;
    private final Descripcion descripcion;

    public DescripcionDeClasificacionCambiada(ClasificacionId entityId, Descripcion descripcion) {
        super("org.example.areatransporteaereo.mercancia.DescripcionDeClasificacionCambiada");
        this.entityId = entityId;
        this.descripcion = descripcion;
    }

    public ClasificacionId getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
