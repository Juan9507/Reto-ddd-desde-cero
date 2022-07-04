package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Licencia implements ValueObject<Licencia.Props> {

    private final Nombre nombre;
    private final Estado estado;

    public Licencia(Nombre nombre, Estado estado) {
        this.nombre = Objects.requireNonNull(nombre);
        this.estado = Objects.requireNonNull(estado);
        if(estado.toString() != "ACTIVO"){
            throw new IllegalArgumentException("El estado de la licencia tiene que estar activo");
        }
    }

    public Licencia actualizarEstadoLicencia(Estado estado){
        return new Licencia(nombre, estado);
    }

    @Override
    public Licencia.Props value() {
        return new Props() {
            @Override
            public Nombre nombre() {
                return nombre;
            }

            @Override
            public Estado estado() {
                return estado;
            }
        };
    }

    public interface Props {
        Nombre nombre();
        Estado estado();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Licencia)) return false;
        Licencia licencia = (Licencia) o;
        return Objects.equals(nombre, licencia.nombre) && estado == licencia.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, estado);
    }
}
