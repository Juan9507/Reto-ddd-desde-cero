package org.example.areatransporteaereo.mercancia.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.mercancia.values.MercanciaId;
import org.example.areatransporteaereo.mercancia.values.OperacionId;
import org.example.areatransporteaereo.mercancia.values.TipoImportacion;

public class ActualizarTipoDeOperacionImportacionExportacion extends Command {

    private final MercanciaId mercanciaId;
    private final OperacionId entityId;
    private final TipoImportacion tipoImportacion;

    public ActualizarTipoDeOperacionImportacionExportacion(
            MercanciaId mercanciaId,
            OperacionId entityId,
            TipoImportacion tipoImportacion) {

        this.mercanciaId = mercanciaId;
        this.entityId = entityId;
        this.tipoImportacion = tipoImportacion;
    }

    public MercanciaId getMercanciaId() {
        return mercanciaId;
    }

    public OperacionId getEntityId() {
        return entityId;
    }

    public TipoImportacion getTipoImportacion() {
        return tipoImportacion;
    }
}
