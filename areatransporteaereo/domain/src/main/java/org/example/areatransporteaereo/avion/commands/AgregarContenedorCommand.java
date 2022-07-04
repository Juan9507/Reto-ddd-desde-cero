package org.example.areatransporteaereo.avion.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.avion.values.*;

public class AgregarContenedorCommand extends Command {

    private final AvionId avionId;
    private final ContenedorId contenedorId;
    private final CargaMaxima cargaMaxima;
    private final Longitud longitud;
    private final Peso peso;

    public AgregarContenedorCommand(
            AvionId avionId,
            ContenedorId contenedorId,
            CargaMaxima cargaMaxima,
            Longitud longitud,
            Peso peso)
    {

        this.avionId = avionId;
        this.contenedorId = contenedorId;
        this.cargaMaxima = cargaMaxima;
        this.longitud = longitud;
        this.peso = peso;
    }

    public AvionId getAvionId() {
        return avionId;
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
