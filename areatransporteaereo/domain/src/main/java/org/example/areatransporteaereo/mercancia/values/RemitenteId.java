package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.Identity;

public class RemitenteId extends Identity {
    /**
     * Se usa cuando se quiere un identificador ramdom
     */
    public RemitenteId(){

    }

    /**
     * Constructor del identificador
     * @param id
     */
    public RemitenteId(String id){
        super(id);
    }

    /**
     * Metodo para crear el identificador de persona, sin tener que declarar el new
     * @param id
     * @return
     */
    public static RemitenteId of(String id){
        return new RemitenteId(id);
    }
}
