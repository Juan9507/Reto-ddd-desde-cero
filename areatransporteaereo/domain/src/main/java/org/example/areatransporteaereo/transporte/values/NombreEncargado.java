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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NombreEncargado)) return false;
        NombreEncargado that = (NombreEncargado) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}
