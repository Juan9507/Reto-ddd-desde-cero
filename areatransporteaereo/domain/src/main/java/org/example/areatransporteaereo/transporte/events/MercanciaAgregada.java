package org.example.areatransporteaereo.transporte.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.Mercancia;
import org.example.areatransporteaereo.mercancia.values.MercanciaId;

public class MercanciaAgregada extends DomainEvent {
    private final MercanciaId mercanciaId;

    public MercanciaAgregada(MercanciaId mercanciaId) {
        super("org.example.areatransporteaereo.transporte.MercanciaAgregada");
        this.mercanciaId = mercanciaId;
    }

    public MercanciaId getMercanciaId() {
        return mercanciaId;
    }
}
