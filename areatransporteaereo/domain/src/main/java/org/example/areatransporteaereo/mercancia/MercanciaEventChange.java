package org.example.areatransporteaereo.mercancia;
import co.com.sofka.domain.generic.EventChange;
import org.example.areatransporteaereo.mercancia.events.*;

public class MercanciaEventChange extends EventChange {
    public MercanciaEventChange(Mercancia mercancia) {
        apply((MercanciaCreada evenet) -> {
            mercancia.fechaCreacion = evenet.getFechaCreacion();
            mercancia.clasificacion = null;
            mercancia.operacion = null;
            mercancia.remitente = null;
        });

        apply((ClasificacionAgregada event) ->{
            mercancia.clasificacion = new Clasificacion(
                    event.getEntityId(),
                    event.getDescripcion(),
                    event.getTipoDeMercancia());
        });

        apply((OperacionMercanciaAgregada event) -> {
            mercancia.operacion = new Operacion(
                    event.getEntityId(),
                    event.getImportacionExportacion());
        });

        apply((RemitenteAgregado event) -> {
            mercancia.remitente = new Remitente(
                    event.getEntityId(),
                    event.getNombre(),
                    event.getIdentidad(),
                    event.getDestinario());
        });

        apply((DescripcionDeClasificacionCambiada event) ->{
            mercancia.clasificacion.cambiarDescripcion(event.getDescripcion());
        });

        apply((TipoDeOperacionImportacionExportacionActualizada event) -> {
            mercancia.operacion.actaulizarTipoDeImportacionExportacion(event.getTipoImportacion());
        });

        apply((DatosRemitenteDelDestinarioCambiado event) -> {
            mercancia.remitente.cambiarDatosDestinario(event.getDatosPersona());
        });
    }
}
