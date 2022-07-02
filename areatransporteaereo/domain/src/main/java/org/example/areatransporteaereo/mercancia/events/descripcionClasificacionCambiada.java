package org.example.areatransporteaereo.mercancia.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.Clasificacion;

public class descripcionClasificacionCambiada extends DomainEvent {
    private Clasificacion clasificacion;

    public descripcionClasificacionCambiada(Clasificacion clasificacion) {
        super("org.example.areatransporteaereo.descripcionClasificacionCambiada");
        this.clasificacion = clasificacion;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }
}
