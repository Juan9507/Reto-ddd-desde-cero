package org.example.areatransporteaereo.transporte.values;

import co.com.sofka.domain.generic.Identity;

public class TransporteId extends Identity {
    /**
     * Se usa cuando se quiere un identificador ramdom
     */
    public TransporteId(){

    }

    /**
     * Constructor del identificador
     * @param id
     */
    public TransporteId(String id){
        super(id);
    }

    /**
     * Metodo para crear el identificador de persona, sin tener que declarar el new
     * @param id
     * @return
     */
    public static TransporteId of(String id){
        return new TransporteId(id);
    }
}
