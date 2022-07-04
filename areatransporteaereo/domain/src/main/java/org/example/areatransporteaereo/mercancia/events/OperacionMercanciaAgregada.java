package org.example.areatransporteaereo.mercancia.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.values.ImportacionExportacion;
import org.example.areatransporteaereo.mercancia.values.OperacionId;

public class OperacionMercanciaAgregada extends DomainEvent {
    private final OperacionId entityId;
    private final ImportacionExportacion importacionExportacion;

    public OperacionMercanciaAgregada(OperacionId entityId, ImportacionExportacion importacionExportacion) {
        super("org.example.areatransporteaereo.mercancia.OperacionAgregada");
        this.entityId = entityId;
        this.importacionExportacion = importacionExportacion;
    }

    public OperacionId getEntityId() {
        return entityId;
    }

    public ImportacionExportacion getImportacionExportacion() {
        return importacionExportacion;
    }
}
