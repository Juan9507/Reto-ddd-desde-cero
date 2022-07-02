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
}
