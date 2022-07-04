package org.example.areatransporteaereo.mercancia.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.values.OperacionId;
import org.example.areatransporteaereo.mercancia.values.TipoImportacion;

public class TipoDeOperacionImportacionExportacionActualizada extends DomainEvent {
    private final OperacionId entityId;
    private final TipoImportacion tipoImportacion;

    public TipoDeOperacionImportacionExportacionActualizada(OperacionId entityId, TipoImportacion tipoImportacion) {
        super("org.example.areatransporteaereo.mercancia.TipoDeOperacionImportacionExportacionActualizada");
        this.entityId = entityId;
        this.tipoImportacion = tipoImportacion;
    }

    public OperacionId getEntityId() {
        return entityId;
    }

    public TipoImportacion getTipoImportacion() {
        return tipoImportacion;
    }
}
