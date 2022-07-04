package org.example.areatransporteaereo.avion.values;

import co.com.sofka.domain.generic.Identity;

public class CertificadoAeronavegabilidadId extends Identity {

    /**
     * Se usa cuando se quiere un identificador ramdom
     */
    public CertificadoAeronavegabilidadId(){

    }

    /**
     * Constructor del identificador
     * @param id
     */
    public CertificadoAeronavegabilidadId(String id){
        super(id);
    }

    /**
     * Metodo para crear el identificador de persona, sin tener que declarar el new
     * @param id
     * @return
     */
    public static CertificadoAeronavegabilidadId of(String id){
        return new CertificadoAeronavegabilidadId(id);
    }

}
