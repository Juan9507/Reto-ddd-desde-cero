package org.example.areatransporteaereo.transporte;

import co.com.sofka.domain.generic.Entity;
import org.example.areatransporteaereo.transporte.values.EncargadoEntregaId;
import org.example.areatransporteaereo.transporte.values.NombreEncargado;


public class EncargadoEntrega extends Entity<EncargadoEntregaId> {

    private NombreEncargado nombreEncargado;
    private Telefono telefono;

    public EncargadoEntrega(EncargadoEntregaId entityId) {
        super(entityId);
    }

    public void actualizarNumeroTelefonico(Integer numero){
        this.telefono = telefono.actualizarNumero(numero);
    }
}
