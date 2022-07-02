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
    }

    public void cambiarDatosDelDestinario(DatosPersona datosPersona){
        this.destinario = destinario.cambiarDatos(datosPersona);
    }
}
