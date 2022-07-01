package org.example.areatransporteaereo.avion;


import co.com.sofka.domain.generic.Entity;
import org.example.areatransporteaereo.avion.values.Estado;
import org.example.areatransporteaereo.avion.values.Licencia;
import org.example.areatransporteaereo.avion.values.Nombre;
import org.example.areatransporteaereo.avion.values.PilotoId;

public class Piloto extends Entity<PilotoId> {

    private Licencia licencia;
    private Nombre nombre;

    public Piloto(PilotoId entityId, Licencia licencia, Nombre nombre) {
        super(entityId);
        this.licencia = licencia;
        this.nombre = nombre;
    }

    public void actualizarEstadoLiciencia(Estado estado){
        this.licencia = licencia.actualizarEstadoLicencia(estado);
    }


}
