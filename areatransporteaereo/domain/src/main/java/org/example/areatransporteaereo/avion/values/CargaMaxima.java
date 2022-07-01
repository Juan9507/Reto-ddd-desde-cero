package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CargaMaxima implements ValueObject<Object> {

    private Peso peso;

    public CargaMaxima(Peso peso) {
        this.peso = Objects.requireNonNull(peso);
    }

    public CargaMaxima ActualizarCargaMaxima(Peso peso){
        return new CargaMaxima(peso);
    }

    @Override
    public Peso value() {
        return peso;
    }
}
