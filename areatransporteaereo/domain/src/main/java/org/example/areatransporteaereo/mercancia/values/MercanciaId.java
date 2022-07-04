package org.example.areatransporteaereo.mercancia.values;

import co.com.sofka.domain.generic.Identity;

public class MercanciaId extends Identity {


    /**
     * Se usa cuando se quiere un identificador ramdom
     */
    public MercanciaId(){

    }

    /**
     * Constructor del identificador
     * @param id
     */
    public MercanciaId(String id){
        super(id);
    }

    /**
     * Metodo para crear el identificador de persona, sin tener que declarar el new
     * @param id
     * @return
     */
    public static MercanciaId of(String id){
        return new MercanciaId(id);
    }

}
