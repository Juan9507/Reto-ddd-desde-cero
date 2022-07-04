package org.example.areatransporteaereo.mercancia.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.values.ClasificacionId;
import org.example.areatransporteaereo.mercancia.values.Descripcion;
import org.example.areatransporteaereo.mercancia.values.TipoDeMercancia;

public class ClasificacionAgregada extends DomainEvent {
    private final ClasificacionId entityId;
    private final Descripcion descripcion;
    private final TipoDeMercancia tipoDeMercancia;

    public ClasificacionAgregada(ClasificacionId entityId, Descripcion descripcion, TipoDeMercancia tipoDeMercancia) {
        super("org.example.areatransporteaereo.mercancia.ClasificacionAgregada");
        this.entityId = entityId;
        this.descripcion = descripcion;
        this.tipoDeMercancia = tipoDeMercancia;
    }

    public ClasificacionId getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public TipoDeMercancia getTipoDeMercancia() {
        return tipoDeMercancia;
    }
}
