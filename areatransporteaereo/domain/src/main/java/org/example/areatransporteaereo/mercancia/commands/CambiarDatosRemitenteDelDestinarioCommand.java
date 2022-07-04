package org.example.areatransporteaereo.mercancia.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.mercancia.values.DatosPersona;
import org.example.areatransporteaereo.mercancia.values.MercanciaId;
import org.example.areatransporteaereo.mercancia.values.RemitenteId;

public class CambiarDatosRemitenteDelDestinarioCommand extends Command {

    private final MercanciaId mercanciaId;
    private final RemitenteId entityId;
    private final DatosPersona datosPersona;

    public CambiarDatosRemitenteDelDestinarioCommand(
            MercanciaId mercanciaId,
            RemitenteId entityId,
            DatosPersona datosPersona
    ){

        this.mercanciaId = mercanciaId;
        this.entityId = entityId;
        this.datosPersona = datosPersona;
    }

    public MercanciaId getMercanciaId() {
        return mercanciaId;
    }

    public RemitenteId getEntityId() {
        return entityId;
    }

    public DatosPersona getDatosPersona() {
        return datosPersona;
    }
}
