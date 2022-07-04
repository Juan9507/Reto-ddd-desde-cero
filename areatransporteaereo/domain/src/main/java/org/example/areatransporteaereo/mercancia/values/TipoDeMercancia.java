package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoDeMercancia implements ValueObject<TipoDeMercancia.Props> {

    private final String decripcion;
    private final String tipo;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TipoDeMercancia)) return false;
        TipoDeMercancia that = (TipoDeMercancia) o;
        return Objects.equals(decripcion, that.decripcion) && Objects.equals(tipo, that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decripcion, tipo);
    }
}
