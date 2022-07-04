package org.example.areatransporteaereo.transporte.values;

import co.com.sofka.domain.generic.Identity;

public class EncargadoEntregaId extends Identity {
    /**
     * Se usa cuando se quiere un identificador ramdom
     */
    public EncargadoEntregaId(){

    }

    /**
     * Constructor del identificador
     * @param id
     */
    public EncargadoEntregaId(String id){
        super(id);
    }

    /**
     * Metodo para crear el identificador de persona, sin tener que declarar el new
     * @param id
     * @return
     */
    public static EncargadoEntregaId of(String id){
        return new EncargadoEntregaId(id);
    }
}
