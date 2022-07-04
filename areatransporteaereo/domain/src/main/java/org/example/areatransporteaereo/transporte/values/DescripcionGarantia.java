package org.example.areatransporteaereo.transporte.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DescripcionGarantia implements ValueObject<String> {

    private final String descripcionGarantia;

    public DescripcionGarantia(String descripcionGarantia) {
        this.descripcionGarantia = Objects.requireNonNull(descripcionGarantia);
    }

    public DescripcionGarantia cambiarDescripcion(String descripcion){
        return new DescripcionGarantia(descripcion);
    }

    @Override
    public String value() {
        return descripcionGarantia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DescripcionGarantia)) return false;
        DescripcionGarantia that = (DescripcionGarantia) o;
        return Objects.equals(descripcionGarantia, that.descripcionGarantia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcionGarantia);
    }
}
