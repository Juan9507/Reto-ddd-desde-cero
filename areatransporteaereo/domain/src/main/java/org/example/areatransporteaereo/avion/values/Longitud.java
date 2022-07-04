package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Longitud implements ValueObject<Longitud.Props> {

    private final Integer alto;
    private final Integer largo;
    private final Integer ancho;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Longitud)) return false;
        Longitud longitud = (Longitud) o;
        return Objects.equals(alto, longitud.alto) && Objects.equals(largo, longitud.largo) && Objects.equals(ancho, longitud.ancho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alto, largo, ancho);
    }
}
