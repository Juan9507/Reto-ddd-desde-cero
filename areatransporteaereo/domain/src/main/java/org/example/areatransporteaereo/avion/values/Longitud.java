package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Longitud implements ValueObject<Longitud.Props> {

    private Integer alto;
    private Integer largo;
    private Integer ancho;

    public Longitud(Integer alto, Integer largo, Integer ancho) {
        this.alto = Objects.requireNonNull(alto);
        this.largo = Objects.requireNonNull(largo);
        this.ancho = Objects.requireNonNull(ancho);
    }

    @Override
    public Longitud.Props value() {
        return new Props() {
            @Override
            public Integer alto() {
                return alto;
            }

            @Override
            public Integer largo() {
                return largo;
            }

            @Override
            public Integer ancho() {
                return ancho;
            }
        };
    }

    public interface Props {
        Integer alto();
        Integer largo();
        Integer ancho();
    }
}
