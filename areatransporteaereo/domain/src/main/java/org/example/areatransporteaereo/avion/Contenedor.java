package org.example.areatransporteaereo.avion;

import co.com.sofka.domain.generic.Entity;
import org.example.areatransporteaereo.avion.values.CargaMaxima;
import org.example.areatransporteaereo.avion.values.ContenedorId;
import org.example.areatransporteaereo.avion.values.Longitud;
import org.example.areatransporteaereo.avion.values.Peso;

public class Contenedor extends Entity<ContenedorId> {

    private CargaMaxima cargaMaxima;
    private Peso peso;
    private Longitud longitud;

    public Contenedor(ContenedorId contenedorId,CargaMaxima cargaMaxima, Longitud longitud, Peso peso) {
        super(contenedorId);
        this.cargaMaxima = cargaMaxima;
        this.longitud = longitud;
        this.peso = peso;
    }

    public void ActualizarCargaMaxima(Peso peso){
        this.cargaMaxima = cargaMaxima.ActualizarCargaMaxima(peso);
    }


}
