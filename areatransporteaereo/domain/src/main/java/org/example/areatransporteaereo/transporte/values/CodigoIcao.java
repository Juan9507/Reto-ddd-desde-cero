package org.example.areatransporteaereo.transporte.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CodigoIcao implements ValueObject<Integer> {

    private final Integer codigoIcao;

    public CodigoIcao(Integer codigoIcao) {
        this.codigoIcao = Objects.requireNonNull(codigoIcao);
    }

    public CodigoIcao cambiarCodigo(Integer codigoIcao){
        return new CodigoIcao(codigoIcao);
    }

    @Override
    public Integer value() {
        return codigoIcao;
    }
}
