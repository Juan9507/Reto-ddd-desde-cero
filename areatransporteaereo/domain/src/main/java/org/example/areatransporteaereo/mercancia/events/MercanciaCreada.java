package org.example.areatransporteaereo.mercancia.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.values.*;

public class MercanciaCreada extends DomainEvent {
    private final ClasificacionId clasificacionId;
    private final RemitenteId remitenteId;
    private final Descripcion descripcion;
    private final TipoDeMercancia tipoDeMercancia;
    private final Nombre nombre;
    private final Identidad identidad;
    private final Destinario destinario;

    public MercanciaCreada(ClasificacionId clasificacionId, RemitenteId remitenteId,
                           Descripcion descripcion, TipoDeMercancia tipoDeMercancia,
                           Nombre nombre, Identidad identidad, Destinario destinario) {
        super("org.example.areatransporteaereo.MercanciaCreada");

        this.clasificacionId = clasificacionId;
        this.remitenteId = remitenteId;
        this.descripcion = descripcion;
        this.tipoDeMercancia = tipoDeMercancia;
        this.nombre = nombre;
        this.identidad = identidad;
        this.destinario = destinario;
    }

    public ClasificacionId getClasificacionId() {
        return clasificacionId;
    }

    public RemitenteId getRemitenteId() {
        return remitenteId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public TipoDeMercancia getTipoDeMercancia() {
        return tipoDeMercancia;
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
