package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosPersona implements ValueObject<DatosPersona.Props> {

    private final String nombreCompleto;
    private final String direccion;

    public DatosPersona(String nombreCompleto, String direccion) {
        this.nombreCompleto = Objects.requireNonNull(nombreCompleto);
        this.direccion = Objects.requireNonNull(direccion);
    }

    @Override
    public DatosPersona.Props value() {
        return new Props() {
            @Override
            public String nombreCompleto() {
                return nombreCompleto;
            }

            @Override
            public String direccion() {
                return direccion;
            }
        };
    }

    public interface Props {
        String nombreCompleto();
        String direccion();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DatosPersona)) return false;
        DatosPersona that = (DatosPersona) o;
        return Objects.equals(nombreCompleto, that.nombreCompleto) && Objects.equals(direccion, that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCompleto, direccion);
    }
}
