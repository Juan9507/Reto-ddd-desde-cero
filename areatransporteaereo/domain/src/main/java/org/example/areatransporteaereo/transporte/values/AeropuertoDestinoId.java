package org.example.areatransporteaereo.transporte.values;

import co.com.sofka.domain.generic.Identity;

public class AeropuertoDestinoId extends Identity {
    /**
     * Se usa cuando se quiere un identificador ramdom
     */
    public AeropuertoDestinoId(){

    }

    /**
     * Constructor del identificador
     * @param id
     */
    public AeropuertoDestinoId(String id){
        super(id);
    }

    /**
     * Metodo para crear el identificador de persona, sin tener que declarar el new
     * @param id
     * @return
     */
    public static AeropuertoDestinoId of(String id){
        return new AeropuertoDestinoId(id);
    }
}
