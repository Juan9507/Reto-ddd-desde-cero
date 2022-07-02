package org.example.areatransporteaereo.mercancia.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.mercancia.values.*;

public class CrearMercanciaCommand extends Command {
    private final MercanciaId mercanciaId;
    private final ClasificacionId clasificacionId;
    private final Descripcion descripcion;
    private final RemitenteId remitenteId;
    private final TipoDeMercancia tipoDeMercancia;
    private final Nombre nombre;
    private final Identidad identidad;
    private final Destinario destinario;

    public CrearMercanciaCommand(MercanciaId mercanciaId, ClasificacionId clasificacionId,
                                 Descripcion descripcion, RemitenteId remitenteId,
                                 TipoDeMercancia tipoDeMercancia, Nombre nombre,
                                 Identidad identidad, Destinario destinario) {
        this.mercanciaId = mercanciaId;
        this.clasificacionId = clasificacionId;
        this.descripcion = descripcion;
        this.remitenteId = remitenteId;
        this.tipoDeMercancia = tipoDeMercancia;
        this.nombre = nombre;
        this.identidad = identidad;
        this.destinario = destinario;
    }

    public MercanciaId getMercanciaId() {
        return mercanciaId;
    }

    public ClasificacionId getClasificacionId() {
        return clasificacionId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public RemitenteId getRemitenteId() {
        return remitenteId;
    }

    public TipoDeMercancia getTipoDeMercancia() {
        return tipoDeMercancia;
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
