package org.example.areatransporteaereo.transporte.command;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.mercancia.values.MercanciaId;
import org.example.areatransporteaereo.transporte.values.TransporteId;

public class AgregarMercanciaCommand extends Command {

    private final TransporteId transporteId;
    private final MercanciaId mercanciaId;

    public AgregarMercanciaCommand(
            TransporteId transporteId,
            MercanciaId mercanciaId)
    {

        this.transporteId = transporteId;
        this.mercanciaId = mercanciaId;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public MercanciaId getMercanciaId() {
        return mercanciaId;
    }

}
