package org.example.areatransporteaereo.transporte;

import co.com.sofka.domain.generic.EventChange;
import org.example.areatransporteaereo.transporte.events.*;

import java.util.HashSet;

public class TransporteChange extends EventChange {
    public TransporteChange(Transporte transporte) {
        apply((TransporteCreado event) ->{
            transporte.avionId = event.getAvionId();
            transporte.listaMercancia = new HashSet<>();
            transporte.aeropuertoDestino = null;
            transporte.encargadoEntrega = null;
            transporte.garantia = null;
        });

        /**
         * Agregar mercancia
         */
        apply((MercanciaAgregada event) -> {
            transporte.listaMercancia.add(event.getMercanciaId());
        });

        /**
         * agregar aeropuerto destino
         */
        apply((AeropuertoDestinoAgregado event) -> {
            transporte.aeropuertoDestino = new AeropuertoDestino(
                    event.getAeropuertoDestinoIdId(),
                    event.getCodigoIcao(),
                    event.getNombreAeropuerto(),
                    event.getPais());
        });

        /**
         * Generar garantia
         */
        apply((garantiaGenerada event) -> {
            transporte.garantia = new Garantia(event.getEntityId(),event.getDescripcionGarantia());
        });

        /**
         * agregar encargado
         */
        apply((EncargadoEntregaAgregado event) -> {
            transporte.encargadoEntrega = new EncargadoEntrega(
                    event.getEntityId(),
                    event.getNombreEncargado(),
                    event.getTelefono());
        });

        /**
         * Actualizar numero
         */
        apply((TelefonoEncargadoEntregaActualizado event) -> {
            transporte.encargadoEntrega.actualizarNumeroTelefonico(event.getNumero());
        });
    }
}
