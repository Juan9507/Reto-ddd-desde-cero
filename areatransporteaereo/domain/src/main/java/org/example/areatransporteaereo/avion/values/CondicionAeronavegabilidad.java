package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CondicionAeronavegabilidad implements ValueObject<CondicionAeronavegabilidad.Props> {

    private Condicion condicion;
    private String description;

    public CondicionAeronavegabilidad(Condicion condicion, String description) {
        this.condicion = Objects.requireNonNull(condicion);
        this.description = Objects.requireNonNull(description);
        if(condicion.toString() != "ESTABLE"){
            throw new IllegalArgumentException("El avion tiene que estar en optimas condiciones");
        }
    }

    /**
     * Comportamiento actualizarCertificado
     * @param condicion - la nueva condicion
     * @return - el nuevo objeto
     */
    public CondicionAeronavegabilidad ActualizaCondicion(Condicion condicion){
        return new CondicionAeronavegabilidad(condicion,description);
    }

    @Override
    public CondicionAeronavegabilidad.Props value() {
        return new Props() {
            @Override
            public Condicion condicion() {
                return condicion;
            }

            @Override
            public String descripcion() {
                return description;
            }
        };
    }

    public interface Props {
        Condicion condicion();
        String descripcion();
    }
}
