package org.example.areatransporteaereo.mercancia;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.areatransporteaereo.mercancia.values.ClasificacionId;
import org.example.areatransporteaereo.mercancia.values.MercanciaId;
import org.example.areatransporteaereo.mercancia.values.RemitenteId;

public class Mercancia extends AggregateEvent<MercanciaId> {

    //Entidad
    private Clasificacion clasificacion;
    //Entidad
    private Operacion operacion;
    //Entidad
    private Remitente remitente;

    public Mercancia(MercanciaId mercanciaId, ClasificacionId clasificacionId, RemitenteId remitenteId) {
        super(mercanciaId);
    }
}
