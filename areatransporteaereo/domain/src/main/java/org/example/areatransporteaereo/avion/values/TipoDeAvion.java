package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoDeAvion implements ValueObject<TipoDeAvion.Props> {

    private final String descripcion;
    private final TipoDeFuncion tipoDeFuncion;

    public TipoDeAvion(String descripcion, TipoDeFuncion tipoDeFuncion) {
        this.descripcion = Objects.requireNonNull(descripcion);
        this.tipoDeFuncion = Objects.requireNonNull(tipoDeFuncion);
        if(tipoDeFuncion.toString() != "CARGA"){
            throw new IllegalArgumentException("El avion solo puede ser de carga");
        }
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String descripcion() {
                return descripcion;
            }

            @Override
            public TipoDeFuncion tipoDeFuncion() {
                return tipoDeFuncion;
            }
        };
    }


    public interface Props {
        String descripcion();
        TipoDeFuncion tipoDeFuncion();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TipoDeAvion)) return false;
        TipoDeAvion that = (TipoDeAvion) o;
        return Objects.equals(descripcion, that.descripcion) && tipoDeFuncion == that.tipoDeFuncion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion, tipoDeFuncion);
    }
}
