package org.example.areatransporteaereo.transporte;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<Telefono.Props> {

    private final String indicativo;
    private final Integer numero;

    public Telefono(String indicativo, Integer numero) {
        this.indicativo = Objects.requireNonNull(indicativo);
        this.numero = Objects.requireNonNull(numero);
    }

    @Override
    public Telefono.Props value() {
        return new Props() {
            @Override
            public String indicativo() {
                return indicativo;
            }

            @Override
            public Integer numero() {
                return numero;
            }
        };
    }

    public Telefono actualizarNumero(Integer numero){
        return new Telefono(indicativo,numero);
    }

    public interface Props {
        String indicativo();
        Integer numero();
    }
}
