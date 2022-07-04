package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Pais implements ValueObject<Pais.Props> {

    private final String codigoPais;
    private final String nombrePais;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pais)) return false;
        Pais pais = (Pais) o;
        return Objects.equals(codigoPais, pais.codigoPais) && Objects.equals(nombrePais, pais.nombrePais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoPais, nombrePais);
    }
}
