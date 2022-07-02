package org.example.areatransporteaereo.transporte.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreEncargado implements ValueObject<NombreEncargado.Props> {

    private final String nombre;
    private final String apellido;

    public NombreEncargado(String nombre, String apellido) {
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
    }

    @Override
    public NombreEncargado.Props value() {
        return new Props() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String apellido() {
                return apellido;
            }
        };
    }

    public interface Props {
        String nombre();
        String apellido();
    }
}
