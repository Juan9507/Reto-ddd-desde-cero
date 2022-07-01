package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosPersona implements ValueObject<DatosPersona.Props> {

    private String nombreCompleto;
    private String direccion;

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
}
