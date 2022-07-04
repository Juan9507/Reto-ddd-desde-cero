package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Identidad implements ValueObject<Identidad.Props> {

    private final TipoIdentidad tipoIdentidad;
    private final String valor;

    public Identidad(TipoIdentidad tipoIdentidad, String valor) {
        this.tipoIdentidad = Objects.requireNonNull(tipoIdentidad);
        this.valor = Objects.requireNonNull(valor);
    }

    @Override
    public Identidad.Props value() {
        return new Props() {
            @Override
            public TipoIdentidad tipoIdentidad() {
                return tipoIdentidad;
            }

            @Override
            public String valor() {
                return valor;
            }
        };
    }

    public interface Props {
        TipoIdentidad tipoIdentidad(); //enum
        String valor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Identidad)) return false;
        Identidad identidad = (Identidad) o;
        return tipoIdentidad == identidad.tipoIdentidad && Objects.equals(valor, identidad.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoIdentidad, valor);
    }
}
