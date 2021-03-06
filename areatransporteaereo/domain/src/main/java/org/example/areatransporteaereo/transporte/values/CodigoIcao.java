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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodigoIcao)) return false;
        CodigoIcao that = (CodigoIcao) o;
        return Objects.equals(codigoIcao, that.codigoIcao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoIcao);
    }
}
