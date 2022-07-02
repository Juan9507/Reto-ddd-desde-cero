package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {

    private final String descripcion;

    public Descripcion(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    @Override
    public String value() {
        return descripcion;
    }

    public Descripcion cambiarDescripcion(String descripcion){
        return new Descripcion(descripcion);
    }
}
