package org.example.areatransporteaereo.mercancia.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.mercancia.values.ClasificacionId;
import org.example.areatransporteaereo.mercancia.values.Descripcion;
import org.example.areatransporteaereo.mercancia.values.MercanciaId;

public class CambiarDescripcionDeClasificacionCommand extends Command {

    private final MercanciaId mercanciaId;
    private final ClasificacionId entityId;
    private final Descripcion descripcion;

    public CambiarDescripcionDeClasificacionCommand(
            MercanciaId mercanciaId,
            ClasificacionId entityId,
            Descripcion descripcion)
    {

        this.mercanciaId = mercanciaId;
        this.entityId = entityId;
        this.descripcion = descripcion;
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
}
