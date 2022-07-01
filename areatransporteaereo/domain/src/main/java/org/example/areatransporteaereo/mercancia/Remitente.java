package org.example.areatransporteaereo.mercancia;

import co.com.sofka.domain.generic.Entity;
import org.example.areatransporteaereo.mercancia.values.Destinario;
import org.example.areatransporteaereo.mercancia.values.Identidad;
import org.example.areatransporteaereo.mercancia.values.Nombre;
import org.example.areatransporteaereo.mercancia.values.RemitenteId;

public class Remitente extends Entity<RemitenteId> {

    private Nombre nombre;
    private Identidad identidad;
    private Destinario destinario;

    public Remitente(RemitenteId entityId) {
        super(entityId);
    }
}
