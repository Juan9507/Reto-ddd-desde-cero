package org.example.areatransporteaereo.mercancia;

import co.com.sofka.domain.generic.Entity;
import org.example.areatransporteaereo.mercancia.values.*;

public class Remitente extends Entity<RemitenteId> {

    private Nombre nombre;
    private Identidad identidad;
    private Destinario destinario;

    public Remitente(RemitenteId entityId, Nombre nombre, Identidad identidad,
                     Destinario destinario) {
        super(entityId);
        this.nombre = nombre;
        this.identidad = identidad;
        this.destinario = destinario;
    }

    /**
     * Cambiar datos del destinario
     * @param datosPersona
     */
    public void cambiarDatosDestinario(DatosPersona datosPersona){
        this.destinario = destinario.cambiarDatos(datosPersona);
    }
}
