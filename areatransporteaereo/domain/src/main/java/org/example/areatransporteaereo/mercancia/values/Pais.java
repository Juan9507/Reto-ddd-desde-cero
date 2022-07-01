package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Pais implements ValueObject<Pais.Props> {

    private String codigoPais;
    private String nombrePais;

    public Pais(String codigoPais, String nombrePais) {
        this.codigoPais = Objects.requireNonNull(codigoPais);
        this.nombrePais = Objects.requireNonNull(nombrePais);
    }

    @Override
    public Pais.Props value() {
        return new Props() {
            @Override
            public String codigoPais() {
                return codigoPais;
            }

            @Override
            public String nombrePais() {
                return nombrePais;
            }
        };
    }

    public interface Props {
        String codigoPais();
        String nombrePais();
    }
}
