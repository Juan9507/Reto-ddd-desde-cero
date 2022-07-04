package org.example.areatransporteaereo.transporte.command;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.mercancia.values.Pais;
import org.example.areatransporteaereo.transporte.values.AeropuertoDestinoId;
import org.example.areatransporteaereo.transporte.values.CodigoIcao;
import org.example.areatransporteaereo.transporte.values.NombreAeropuerto;
import org.example.areatransporteaereo.transporte.values.TransporteId;

public class AgregarAeropuertoDestinoCommand extends Command {

    private final TransporteId transporteId;
    private final AeropuertoDestinoId aeropuertoDestinoIdId;
    private final CodigoIcao codigoIcao;
    private final NombreAeropuerto nombreAeropuerto;
    private final Pais pais;

    public AgregarAeropuertoDestinoCommand(
            TransporteId transporteId,
            AeropuertoDestinoId aeropuertoDestinoIdId,
            CodigoIcao codigoIcao,
            NombreAeropuerto nombreAeropuerto,
            Pais pais)
    {

        this.transporteId = transporteId;
        this.aeropuertoDestinoIdId = aeropuertoDestinoIdId;
        this.codigoIcao = codigoIcao;
        this.nombreAeropuerto = nombreAeropuerto;
        this.pais = pais;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public AeropuertoDestinoId getAeropuertoDestinoIdId() {
        return aeropuertoDestinoIdId;
    }

    public CodigoIcao getCodigoIcao() {
        return codigoIcao;
    }

    public NombreAeropuerto getNombreAeropuerto() {
        return nombreAeropuerto;
    }

    public Pais getPais() {
        return pais;
    }
}
