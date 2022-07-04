package org.example.areatransporteaereo.mercancia.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.mercancia.values.*;

public class CrearMercanciaCommand extends Command {
    private final MercanciaId mercanciaId;
    private final FechaCreacion fechaCreacion;

    public CrearMercanciaCommand(MercanciaId mercanciaId, FechaCreacion fechaCreacion){

        this.mercanciaId = mercanciaId;
        this.fechaCreacion = fechaCreacion;
    }

    public MercanciaId getMercanciaId() {
        return mercanciaId;
    }

    public FechaCreacion getFechaCreacion() {
        return fechaCreacion;
    }
}
