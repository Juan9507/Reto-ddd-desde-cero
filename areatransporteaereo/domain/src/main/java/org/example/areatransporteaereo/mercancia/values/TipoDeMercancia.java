package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoDeMercancia implements ValueObject<TipoDeMercancia.Props> {

    private String decripcion;
    private String tipo;

    public TipoDeMercancia(String decripcion, String tipo) {
        this.decripcion = Objects.requireNonNull(decripcion);
        this.tipo = Objects.requireNonNull(tipo);
    }

    @Override
    public TipoDeMercancia.Props value() {
        return new Props() {
            @Override
            public String descripcion() {
                return decripcion;
            }

            @Override
            public String tipo() {
                return tipo;
            }
        };
    }

    public interface Props {
        String descripcion();
        String tipo(); //ej: liviano, pesado, flagil
    }
}
