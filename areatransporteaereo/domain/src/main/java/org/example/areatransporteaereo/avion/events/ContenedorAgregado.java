package org.example.areatransporteaereo.avion.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.values.CargaMaxima;
import org.example.areatransporteaereo.avion.values.ContenedorId;
import org.example.areatransporteaereo.avion.values.Longitud;
import org.example.areatransporteaereo.avion.values.Peso;

public class ContenedorAgregado extends DomainEvent {
    private final ContenedorId contenedorId;
    private final CargaMaxima cargaMaxima;
    private final Longitud longitud;
    private final Peso peso;

    public ContenedorAgregado(ContenedorId contenedorId, CargaMaxima cargaMaxima, Longitud longitud, Peso peso) {
        super("org.example.areatransporteaereo.avion.ContenedorAgregado");
        this.contenedorId = contenedorId;
        this.cargaMaxima = cargaMaxima;
        this.longitud = longitud;
        this.peso = peso;
    }

    public ContenedorId getContenedorId() {
        return contenedorId;
    }

    public CargaMaxima getCargaMaxima() {
        return cargaMaxima;
    }

    public Longitud getLongitud() {
        return longitud;
    }

    public Peso getPeso() {
        return peso;
    }
}
