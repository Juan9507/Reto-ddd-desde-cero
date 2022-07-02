package org.example.areatransporteaereo.transporte;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.areatransporteaereo.avion.values.AvionId;
import org.example.areatransporteaereo.mercancia.Mercancia;
import org.example.areatransporteaereo.mercancia.values.MercanciaId;
import org.example.areatransporteaereo.transporte.values.AeropuertoDestinoId;
import org.example.areatransporteaereo.transporte.values.EncargadoEntregaId;
import org.example.areatransporteaereo.transporte.values.TransporteId;

import java.util.Map;

public class Transporte extends AggregateEvent<TransporteId> {

    protected AvionId avionId;
    protected Map<MercanciaId, Mercancia> listaMercancia;
    //Entidad
    protected AeropuertoDestino aeropuertoDestino;
    //Entidad
    protected Garantia garantia;
    //Entidad
    protected EncargadoEntrega encargadoEntrega;

    public Transporte(TransporteId entityId, EncargadoEntregaId encargadoEntregaId,
                      AeropuertoDestinoId aeropuertoDestinoId) {
        super(entityId);
    }
}
