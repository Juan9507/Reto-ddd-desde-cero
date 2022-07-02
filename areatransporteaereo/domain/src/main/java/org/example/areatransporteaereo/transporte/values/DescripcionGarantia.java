package org.example.areatransporteaereo.transporte.values;

import co.com.sofka.domain.generic.ValueObject;

public class DescripcionGarantia implements ValueObject<String> {

    private final String descripcionGarantia;

    public DescripcionGarantia(String descripcionGarantia) {
        this.descripcionGarantia = descripcionGarantia;
    }

    public DescripcionGarantia cambiarDescripcion(String descripcion){
        return new DescripcionGarantia(descripcion);
    }

    @Override
    public String value() {
        return descripcionGarantia;
    }
}
