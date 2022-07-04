package org.example.areatransporteaereo.transporte.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.values.AvionId;

public class TransporteCreado extends DomainEvent {
    private final AvionId avionId;

    public TransporteCreado(AvionId avionId) {
        super("org.example.areatransporteaereo.transporte.TransporteCreado");
        this.avionId = avionId;
    }

    public AvionId getAvionId() {
        return avionId;
    }
}
