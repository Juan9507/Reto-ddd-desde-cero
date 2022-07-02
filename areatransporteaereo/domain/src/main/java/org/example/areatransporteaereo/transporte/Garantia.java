package org.example.areatransporteaereo.transporte;

import co.com.sofka.domain.generic.Entity;
import org.example.areatransporteaereo.transporte.values.DescripcionGarantia;
import org.example.areatransporteaereo.transporte.values.GarantiaId;

public class Garantia extends Entity<GarantiaId> {

    private DescripcionGarantia descripcionGarantia;

    public Garantia(GarantiaId entityId, DescripcionGarantia descripcionGarantia) {
        super(entityId);
        this.descripcionGarantia = descripcionGarantia;
    }

    //Comportamiento
    public void CambiarDescrionDeGarantia(String descripcion){
        this.descripcionGarantia = descripcionGarantia.cambiarDescripcion(descripcion);

    }
}
