package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.Identity;

public class ClasificacionId extends Identity {

    /**
     * Se usa cuando se quiere un identificador ramdom
     */
    public ClasificacionId(){

    }

    /**
     * Constructor del identificador
     * @param id
     */
    public ClasificacionId(String id){
        super(id);
    }

    /**
     * Metodo para crear el identificador de persona, sin tener que declarar el new
     * @param id
     * @return
     */
    public static ClasificacionId of(String id){
        return new ClasificacionId(id);
    }

}
