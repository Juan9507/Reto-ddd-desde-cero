package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.Identity;

public class ContenedorId extends Identity {

    /**
     * Se usa cuando se quiere un identificador ramdom
     */
    public ContenedorId(){

    }

    /**
     * Constructor del identificador
     * @param id
     */
    public ContenedorId(String id){
        super(id);
    }

    /**
     * Metodo para crear el identificador de persona, sin tener que declarar el new
     * @param id
     * @return
     */
    public static ContenedorId of(String id){
        return new ContenedorId(id);
    }

}
