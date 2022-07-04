package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class FechaCreacion implements ValueObject<String> {

    private final Date fechaCreacion;

    public FechaCreacion() {
        this.fechaCreacion = new Date();
    }

    @Override
    public String value() {
        return fechaCreacion.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FechaCreacion)) return false;
        FechaCreacion that = (FechaCreacion) o;
        return Objects.equals(fechaCreacion, that.fechaCreacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaCreacion);
    }
}
