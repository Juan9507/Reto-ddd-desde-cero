package org.example.areatransporteaereo.transporte.events;

import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoEncargadoEntregaActualizado extends DomainEvent {
    private final Integer numero;

    public TelefonoEncargadoEntregaActualizado(Integer numero) {
        super("org.example.areatransporteaereo.transporte.TelefonoEncargadoEntregaActualizado");
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }
}
