package org.example.areatransporteaereo.transporte.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.values.Pais;
import org.example.areatransporteaereo.transporte.values.AeropuertoDestinoId;
import org.example.areatransporteaereo.transporte.values.CodigoIcao;
import org.example.areatransporteaereo.transporte.values.NombreAeropuerto;

public class AeropuertoDestinoAgregado extends DomainEvent {
    private final AeropuertoDestinoId aeropuertoDestinoIdId;
    private final CodigoIcao codigoIcao;
    private final NombreAeropuerto nombreAeropuerto;
    private final Pais pais;

    public AeropuertoDestinoAgregado(
            AeropuertoDestinoId aeropuertoDestinoIdId,
            CodigoIcao codigoIcao,
            NombreAeropuerto nombreAeropuerto,
            Pais pais) {
        super("org.example.areatransporteaereo.transporte.AeropuertoDestinoAgregado");
        this.aeropuertoDestinoIdId = aeropuertoDestinoIdId;
        this.codigoIcao = codigoIcao;
        this.nombreAeropuerto = nombreAeropuerto;
        this.pais = pais;
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
