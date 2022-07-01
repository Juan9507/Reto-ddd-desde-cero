package org.example.areatransporteaereo.mercancia;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.areatransporteaereo.mercancia.values.MercanciaId;

public class Mercancia extends AggregateEvent<MercanciaId> {

    //Entidad
    private Clasificacion clasificacion;

    public Mercancia(MercanciaId entityId) {
        super(entityId);
    }
}
