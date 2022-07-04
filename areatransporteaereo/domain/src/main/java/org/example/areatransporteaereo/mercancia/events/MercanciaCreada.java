package org.example.areatransporteaereo.mercancia.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.values.*;

public class MercanciaCreada extends DomainEvent {

    private final FechaCreacion fechaCreacion;

    public MercanciaCreada(FechaCreacion fechaCreacion) {
        super("org.example.areatransporteaereo.mercancia.MercanciaCreada");
        this.fechaCreacion = fechaCreacion;
    }

    public FechaCreacion getFechaCreacion() {
        return fechaCreacion;
    }
}
