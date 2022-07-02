package org.example.areatransporteaereo.avion.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.values.TipoDeAvion;

public class AvionCreado extends DomainEvent {

    private final TipoDeAvion tipoDeAvion;
    public AvionCreado(TipoDeAvion tipoDeAvion) {
        super("org.example.areatransporteaereo.AvionCreado");
        this.tipoDeAvion = tipoDeAvion;
    }

    public TipoDeAvion getTipoDeAvion() {
        return tipoDeAvion;
    }
}
