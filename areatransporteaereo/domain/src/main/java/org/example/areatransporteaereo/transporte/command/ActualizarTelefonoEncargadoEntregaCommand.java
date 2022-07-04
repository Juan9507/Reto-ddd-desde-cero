package org.example.areatransporteaereo.transporte.command;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.transporte.values.TransporteId;

public class ActualizarTelefonoEncargadoEntregaCommand extends Command {

    private final TransporteId transporteId;
    private final Integer numero;

    public ActualizarTelefonoEncargadoEntregaCommand(TransporteId transporteId, Integer numero){

        this.transporteId = transporteId;
        this.numero = numero;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public Integer getNumero() {
        return numero;
    }
}
