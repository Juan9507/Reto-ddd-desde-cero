package org.example.areatransporteaereo.transporte;

import co.com.sofka.domain.generic.Entity;
import org.example.areatransporteaereo.mercancia.values.Pais;
import org.example.areatransporteaereo.transporte.values.AeropuertoDestinoId;
import org.example.areatransporteaereo.transporte.values.CodigoIcao;
import org.example.areatransporteaereo.transporte.values.NombreAeropuerto;

public class AeropuertoDestino extends Entity<AeropuertoDestinoId> {

    private CodigoIcao codigoIcao;
    private NombreAeropuerto nombreAeropuerto;
    private Pais pais;

    public AeropuertoDestino(AeropuertoDestinoId aeropuertoDestinoIdId,
                             CodigoIcao codigoIcao, NombreAeropuerto nombreAeropuerto, Pais pais) {
        super(aeropuertoDestinoIdId);
        this.codigoIcao = codigoIcao;
        this.nombreAeropuerto = nombreAeropuerto;
        this.pais = pais;
    }

    //Comportamiento cambiar codigoIcao
    public void cambiarCodigoIcao(Integer codigo){
        this.codigoIcao = codigoIcao.cambiarCodigo(codigo);
    }

}
