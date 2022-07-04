package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.Identity;

public class AvionId extends Identity {

    /**
     * Se usa cuando se quiere un identificador ramdom
     */
    public AvionId(){

    }

    /**
     * Constructor del identificador
     * @param id
     */
    public AvionId(String id){
        super(id);
    }

    /**
     * Metodo para crear el identificador de persona, sin tener que declarar el new
     * @param id
     * @return
     */
    public static AvionId of(String id){
        return new AvionId(id);
    }

}
