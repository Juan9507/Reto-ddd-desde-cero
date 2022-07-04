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

    /**
     * Cambiar datos persona
     * @param datosPersona
     * @return
     */
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Destinario)) return false;
        Destinario that = (Destinario) o;
        return Objects.equals(datosPersona, that.datosPersona) && Objects.equals(pais, that.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datosPersona, pais);
    }
}
