package org.example.areatransporteaereo.mercancia.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.values.ImportacionExportacion;
import org.example.areatransporteaereo.mercancia.values.OperacionId;

public class operacionAgregada extends DomainEvent {
    private final OperacionId operacionIdId;
    private final ImportacionExportacion importacionExportacion;

    public operacionAgregada(OperacionId operacionIdId, ImportacionExportacion importacionExportacion) {
        super("org.example.areatransporteaereo.operacionAgregada");
        this.operacionIdId = operacionIdId;
        this.importacionExportacion = importacionExportacion;
    }

    public OperacionId getOperacionIdId() {
        return operacionIdId;
    }

    public ImportacionExportacion getImportacionExportacion() {
        return importacionExportacion;
    }
}
