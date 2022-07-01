package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Licencia implements ValueObject<Licencia.Props> {

    private Nombre nombre;
    private Estado estado;

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
}
