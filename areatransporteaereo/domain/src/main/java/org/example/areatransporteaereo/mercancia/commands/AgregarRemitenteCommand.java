package org.example.areatransporteaereo.mercancia.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.mercancia.values.*;

public class AgregarRemitenteCommand extends Command {

    private final MercanciaId mercanciaId;
    private final RemitenteId entityId;
    private final Nombre nombre;
    private final Identidad identidad;
    private final Destinario destinario;

    public AgregarRemitenteCommand(
            MercanciaId mercanciaId,
            RemitenteId entityId,
            Nombre nombre,
            Identidad identidad,
            Destinario destinario)
    {

        this.mercanciaId = mercanciaId;
        this.entityId = entityId;
        this.nombre = nombre;
        this.identidad = identidad;
        this.destinario = destinario;
    }

    public MercanciaId getMercanciaId() {
        return mercanciaId;
    }

    public RemitenteId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Identidad getIdentidad() {
        return identidad;
    }

    public Destinario getDestinario() {
        return destinario;
    }
}
