package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.Identity;

public class PilotoId extends Identity {

    /**
     * Se usa cuando se quiere un identificador ramdom
     */
    public PilotoId(){

    }

    /**
     * Constructor del identificador
     * @param id
     */
    public PilotoId(String id){
        super(id);
    }

    /**
     * Metodo para crear el identificador de persona, sin tener que declarar el new
     * @param id
     * @return
     */
    public static PilotoId of(String id){
        return new PilotoId(id);
    }

}
