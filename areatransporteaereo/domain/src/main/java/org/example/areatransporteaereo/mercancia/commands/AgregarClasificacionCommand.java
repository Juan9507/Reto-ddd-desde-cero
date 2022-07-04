package org.example.areatransporteaereo.mercancia.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.mercancia.values.*;

public class AgregarClasificacionCommand extends Command {


    private final MercanciaId mercanciaId;
    private final ClasificacionId entityId;
    private final Descripcion descripcion;
    private final TipoDeMercancia tipoDeMercancia;

    public AgregarClasificacionCommand(
            MercanciaId mercanciaId,
            ClasificacionId entityId,
            Descripcion descripcion,
            TipoDeMercancia tipoDeMercancia)
    {
        this.mercanciaId = mercanciaId;
        this.entityId = entityId;
        this.descripcion = descripcion;
        this.tipoDeMercancia = tipoDeMercancia;
    }

    public MercanciaId getMercanciaId() {
        return mercanciaId;
    }

    public ClasificacionId getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public TipoDeMercancia getTipoDeMercancia() {
        return tipoDeMercancia;
    }
}
