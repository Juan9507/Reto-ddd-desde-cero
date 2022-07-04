package org.example.areatransporteaereo.transporte.command;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.transporte.values.DescripcionGarantia;
import org.example.areatransporteaereo.transporte.values.GarantiaId;
import org.example.areatransporteaereo.transporte.values.TransporteId;

public class GenerarGarantiaCommand extends Command {

    private final TransporteId transporteId;
    private final GarantiaId entityId;
    private final DescripcionGarantia descripcionGarantia;

    public GenerarGarantiaCommand(
            TransporteId transporteId,
            GarantiaId entityId,
            DescripcionGarantia descripcionGarantia)
    {

        this.transporteId = transporteId;
        this.entityId = entityId;
        this.descripcionGarantia = descripcionGarantia;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public GarantiaId getEntityId() {
        return entityId;
    }

    public DescripcionGarantia getDescripcionGarantia() {
        return descripcionGarantia;
    }
}
