package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Peso implements ValueObject<Peso.Props> {

    private String tipo;
    private Integer peso;

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
}
