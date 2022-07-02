package org.example.areatransporteaereo.mercancia;

import co.com.sofka.domain.generic.EventChange;
import org.example.areatransporteaereo.mercancia.events.MercanciaCreada;
import org.example.areatransporteaereo.mercancia.events.descripcionClasificacionCambiada;
import org.example.areatransporteaereo.mercancia.events.operacionAgregada;

public class MercanciaEventChange extends EventChange {
    public MercanciaEventChange(Mercancia mercancia) {
        apply((MercanciaCreada event) -> {
            mercancia.clasificacion = new Clasificacion(event.getClasificacionId(),
                    event.getDescripcion(), event.getTipoDeMercancia());
            mercancia.operacion = null;
            mercancia.remitente = new Remitente(event.getRemitenteId(),event.getNombre(),
                    event.getIdentidad(),event.getDestinario());
        });

        apply((descripcionClasificacionCambiada event) -> {
           mercancia.clasificacion = event.getClasificacion();
        });

        apply((operacionAgregada event) ->{
            mercancia.operacion = new Operacion(event.getOperacionIdId(),event.getImportacionExportacion());
        });
    }
}
