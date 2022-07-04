package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CargaMaxima implements ValueObject<Object> {

    private final Peso peso;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargaMaxima)) return false;
        CargaMaxima that = (CargaMaxima) o;
        return Objects.equals(peso, that.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peso);
    }
}
