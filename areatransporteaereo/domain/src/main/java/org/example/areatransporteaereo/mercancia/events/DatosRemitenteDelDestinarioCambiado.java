package org.example.areatransporteaereo.mercancia.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.values.DatosPersona;
import org.example.areatransporteaereo.mercancia.values.RemitenteId;

public class DatosRemitenteDelDestinarioCambiado extends DomainEvent {
    private final RemitenteId entityId;
    private final DatosPersona datosPersona;

    public DatosRemitenteDelDestinarioCambiado(RemitenteId entityId, DatosPersona datosPersona) {
        super("org.example.areatransporteaereo.mercancia.DatosRemitenteDelDestinarioCambiado");
        this.entityId = entityId;
        this.datosPersona = datosPersona;
    }

    public RemitenteId getEntityId() {
        return entityId;
    }

    public DatosPersona getDatosPersona() {
        return datosPersona;
    }
}
