package org.example.areatransporteaereo.transporte.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreAeropuerto implements ValueObject<String> {

    private final String nombreAeropuerto;

    public NombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = Objects.requireNonNull(nombreAeropuerto);
    }

    @Override
    public String value() {
        return nombreAeropuerto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NombreAeropuerto)) return false;
        NombreAeropuerto that = (NombreAeropuerto) o;
        return Objects.equals(nombreAeropuerto, that.nombreAeropuerto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreAeropuerto);
    }
}
