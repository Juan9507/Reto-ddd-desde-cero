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
}
