package org.example.areatransporteaereo.mercancia;

import co.com.sofka.domain.generic.Entity;
import org.example.areatransporteaereo.mercancia.values.ClasificacionId;
import org.example.areatransporteaereo.mercancia.values.Descripcion;
import org.example.areatransporteaereo.mercancia.values.TipoDeMercancia;

public class Clasificacion extends Entity<ClasificacionId> {

    //Objeto de valor
    private Descripcion descripcion;
    private TipoDeMercancia tipoDeMercancia;
    public Clasificacion(ClasificacionId entityId, Descripcion descripcion,
                         TipoDeMercancia tipoDeMercancia) {
        super(entityId);
        this.descripcion = descripcion;
        this.tipoDeMercancia = tipoDeMercancia;
    }

    /**
     * Comportamiento Cambiar Descripcion
     */
    public void cambiarDescripcion(Descripcion descripcion){
        this.descripcion = descripcion;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public TipoDeMercancia tipoDeMercancia() {
        return tipoDeMercancia;
    }
}
