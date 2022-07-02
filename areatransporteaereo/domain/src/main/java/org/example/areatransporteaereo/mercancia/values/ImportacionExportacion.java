package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ImportacionExportacion implements ValueObject<Object> {

    private final TipoImportacion tipoImportacion;

    public ImportacionExportacion(TipoImportacion tipoImportacion) {
        this.tipoImportacion = Objects.requireNonNull(tipoImportacion);
    }

    @Override
    public Object value() {
        return tipoImportacion;
    }

    public ImportacionExportacion actualizarTipo(TipoImportacion tipoImportacion){
        return new ImportacionExportacion(tipoImportacion);
    }
}
