package org.example.areatransporteaereo.avion.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.values.Estado;
import org.example.areatransporteaereo.avion.values.PilotoId;

public class EstadoLicenciaDelPílotoActualizado extends DomainEvent {
    private final PilotoId entityId;
    private final Estado estado;

    public EstadoLicenciaDelPílotoActualizado(PilotoId entityId, Estado estado) {
        super("org.example.areatransporteaereo.avion");
        this.entityId = entityId;
        this.estado = estado;
    }

    public PilotoId getEntityId() {
        return entityId;
    }

    public Estado getEstado() {
        return estado;
    }
}
