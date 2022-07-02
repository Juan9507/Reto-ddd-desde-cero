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

    public void cambiarDescripcionDeClasificacion(String descripcionClasificado){
        this.descripcion = descripcion.cambiarDescripcion(descripcionClasificado);
    }
}
