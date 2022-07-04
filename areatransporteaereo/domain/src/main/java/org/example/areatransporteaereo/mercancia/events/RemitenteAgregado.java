package org.example.areatransporteaereo.mercancia.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.values.Destinario;
import org.example.areatransporteaereo.mercancia.values.Identidad;
import org.example.areatransporteaereo.mercancia.values.Nombre;
import org.example.areatransporteaereo.mercancia.values.RemitenteId;

public class RemitenteAgregado extends DomainEvent {
    private final RemitenteId entityId;
    private final Nombre nombre;
    private final Identidad identidad;
    private final Destinario destinario;

    public RemitenteAgregado(RemitenteId entityId, Nombre nombre, Identidad identidad, Destinario destinario) {
        super("org.example.areatransporteaereo.mercancia.RemitenteAgregado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.identidad = identidad;
        this.destinario = destinario;
    }

    public RemitenteId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Identidad getIdentidad() {
        return identidad;
    }

    public Destinario getDestinario() {
        return destinario;
    }
}
