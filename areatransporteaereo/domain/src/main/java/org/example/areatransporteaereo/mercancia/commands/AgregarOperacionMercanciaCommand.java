package org.example.areatransporteaereo.mercancia.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.mercancia.values.ImportacionExportacion;
import org.example.areatransporteaereo.mercancia.values.MercanciaId;
import org.example.areatransporteaereo.mercancia.values.OperacionId;

public class AgregarOperacionMercanciaCommand extends Command {

    private final MercanciaId mercanciaId;
    private final OperacionId entityId;
    private final ImportacionExportacion importacionExportacion;

    public AgregarOperacionMercanciaCommand(
            MercanciaId mercanciaId,
            OperacionId entityId,
            ImportacionExportacion importacionExportacion
    ){

        this.mercanciaId = mercanciaId;
        this.entityId = entityId;
        this.importacionExportacion = importacionExportacion;
    }

    public MercanciaId getMercanciaId() {
        return mercanciaId;
    }

    public OperacionId getEntityId() {
        return entityId;
    }

    public ImportacionExportacion getImportacionExportacion() {
        return importacionExportacion;
    }
}
