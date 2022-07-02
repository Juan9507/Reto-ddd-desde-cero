package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Destinario implements ValueObject<Destinario.Props> {

    private final DatosPersona datosPersona;
    private final Pais pais;

    public Destinario(DatosPersona datosPersona, Pais pais) {
        this.datosPersona = Objects.requireNonNull(datosPersona);
        this.pais = Objects.requireNonNull(pais);
    }

    public Destinario cambiarDatos(DatosPersona datosPersona){
        return new Destinario(datosPersona,pais);
    }
    @Override
    public Destinario.Props value() {
        return new Props() {
            @Override
            public DatosPersona datosPersona() {
                return datosPersona;
            }

            @Override
            public Pais pais() {
                return pais;
            }
        };
    }

    public interface Props {
        DatosPersona datosPersona();
        Pais pais();

    }
}
