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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImportacionExportacion)) return false;
        ImportacionExportacion that = (ImportacionExportacion) o;
        return tipoImportacion == that.tipoImportacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoImportacion);
    }
}
