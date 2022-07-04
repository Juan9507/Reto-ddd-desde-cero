package org.example.areatransporteaereo.transporte.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.transporte.values.EncargadoEntregaId;
import org.example.areatransporteaereo.transporte.values.NombreEncargado;
import org.example.areatransporteaereo.transporte.values.Telefono;

public class EncargadoEntregaAgregado extends DomainEvent {
    private final EncargadoEntregaId entityId;
    private final NombreEncargado nombreEncargado;
    private final Telefono telefono;

    public EncargadoEntregaAgregado(
            EncargadoEntregaId entityId,
            NombreEncargado nombreEncargado,
            Telefono telefono) {
        super("org.example.areatransporteaereo.transporte.EncargadoEntregaAgregado");
        this.entityId = entityId;
        this.nombreEncargado = nombreEncargado;
        this.telefono = telefono;
    }

    public EncargadoEntregaId getEntityId() {
        return entityId;
    }

    public NombreEncargado getNombreEncargado() {
        return nombreEncargado;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
