package org.example.areatransporteaereo.transporte.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.transporte.values.DescripcionGarantia;
import org.example.areatransporteaereo.transporte.values.GarantiaId;

public class garantiaGenerada extends DomainEvent {
    private final GarantiaId entityId;
    private final DescripcionGarantia descripcionGarantia;

    public garantiaGenerada(GarantiaId entityId, DescripcionGarantia descripcionGarantia) {
        super("org.example.areatransporteaereo.transporte.garantiaGenerada");
        this.entityId = entityId;
        this.descripcionGarantia = descripcionGarantia;
    }

    public GarantiaId getEntityId() {
        return entityId;
    }

    public DescripcionGarantia getDescripcionGarantia() {
        return descripcionGarantia;
    }
}
