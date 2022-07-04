package org.example.areatransporteaereo.transporte;

import co.com.sofka.domain.generic.Entity;
import org.example.areatransporteaereo.transporte.values.EncargadoEntregaId;
import org.example.areatransporteaereo.transporte.values.NombreEncargado;
import org.example.areatransporteaereo.transporte.values.Telefono;


public class EncargadoEntrega extends Entity<EncargadoEntregaId> {

    private NombreEncargado nombreEncargado;
    private Telefono telefono;

    public EncargadoEntrega(EncargadoEntregaId entityId, NombreEncargado nombreEncargado, Telefono telefono) {
        super(entityId);
        this.nombreEncargado = nombreEncargado;
        this.telefono = telefono;
    }

    public void actualizarNumeroTelefonico(Integer numero){
        this.telefono = telefono.actualizarNumero(numero);
    }

    public NombreEncargado nombreEncargado() {
        return nombreEncargado;
    }

    public Telefono telefono() {
        return telefono;
    }
}
