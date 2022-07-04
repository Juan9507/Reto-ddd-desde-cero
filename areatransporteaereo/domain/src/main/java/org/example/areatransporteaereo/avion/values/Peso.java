package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Peso implements ValueObject<Peso.Props> {

    private final String tipo;
    private final Integer peso;

    public Peso(String tipo, Integer peso) {
        this.tipo = Objects.requireNonNull(tipo);
        this.peso = Objects.requireNonNull(peso);
    }

    @Override
    public Peso.Props value() {
        return new Props() {
            @Override
            public String tipo() {
                return tipo;
            }

            @Override
            public Integer peso() {
                return peso;
            }
        };
    }

    public interface Props {
        String tipo();
        Integer peso();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Peso)) return false;
        Peso peso1 = (Peso) o;
        return Objects.equals(tipo, peso1.tipo) && Objects.equals(peso, peso1.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, peso);
    }
}
