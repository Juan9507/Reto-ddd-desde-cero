package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.Identity;

public class OperacionId extends Identity {

    /**
     * Se usa cuando se quiere un identificador ramdom
     */
    public OperacionId(){

    }

    /**
     * Constructor del identificador
     * @param id
     */
    public OperacionId(String id){
        super(id);
    }

    /**
     * Metodo para crear el identificador de persona, sin tener que declarar el new
     * @param id
     * @return
     */
    public static OperacionId of(String id){
        return new OperacionId(id);
    }
}
