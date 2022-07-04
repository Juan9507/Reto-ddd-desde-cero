package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CondicionAeronavegabilidad implements ValueObject<CondicionAeronavegabilidad.Props> {

    private final Condicion condicion;
    private final String description;

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
    public CondicionAeronavegabilidad ActualizarCondicion(Condicion condicion){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CondicionAeronavegabilidad)) return false;
        CondicionAeronavegabilidad that = (CondicionAeronavegabilidad) o;
        return condicion == that.condicion && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condicion, description);
    }
}
