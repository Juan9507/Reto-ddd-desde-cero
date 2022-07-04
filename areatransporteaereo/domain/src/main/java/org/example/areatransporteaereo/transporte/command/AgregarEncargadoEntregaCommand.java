package org.example.areatransporteaereo.transporte.command;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.transporte.values.EncargadoEntregaId;
import org.example.areatransporteaereo.transporte.values.NombreEncargado;
import org.example.areatransporteaereo.transporte.values.Telefono;
import org.example.areatransporteaereo.transporte.values.TransporteId;

public class AgregarEncargadoEntregaCommand extends Command {

    private final TransporteId transporteId;
    private final EncargadoEntregaId entityId;
    private final NombreEncargado nombreEncargado;
    private final Telefono telefono;

    public AgregarEncargadoEntregaCommand(
            TransporteId transporteId,
            EncargadoEntregaId entityId,
            NombreEncargado nombreEncargado,
            Telefono telefono)
    {

        this.transporteId = transporteId;
        this.entityId = entityId;
        this.nombreEncargado = nombreEncargado;
        this.telefono = telefono;
    }

    public TransporteId getTransporteId() {
        return transporteId;
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
