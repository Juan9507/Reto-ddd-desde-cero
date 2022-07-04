package org.example.areatransporteaereo.transporte;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.values.AvionId;
import org.example.areatransporteaereo.mercancia.Mercancia;
import org.example.areatransporteaereo.mercancia.values.MercanciaId;
import org.example.areatransporteaereo.mercancia.values.Pais;
import org.example.areatransporteaereo.transporte.events.*;
import org.example.areatransporteaereo.transporte.values.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Transporte extends AggregateEvent<TransporteId> {

    protected AvionId avionId;
    protected Set<MercanciaId> listaMercancia;
    //Entidad
    protected AeropuertoDestino aeropuertoDestino;
    //Entidad
    protected Garantia garantia;
    //Entidad
    protected EncargadoEntrega encargadoEntrega;

    public Transporte(TransporteId entityId, AvionId avionId) {
        super(entityId);
        appendChange(new TransporteCreado(avionId)).apply();
        subscribe(new TransporteChange(this));
    }

    private Transporte(TransporteId transporteId) {
        super(transporteId);
        subscribe(new TransporteChange(this));
    }

    public static Transporte from(TransporteId transporteId, List<DomainEvent> events) {
        var transporte = new Transporte(transporteId);
        events.forEach(transporte::applyEvent);
        return transporte;
    }

    /**
     * Comportamiento agregar mercancia
     */
    public void agregarMercancia(MercanciaId mercanciaId) {
        Objects.requireNonNull(mercanciaId);
        appendChange(new MercanciaAgregada(mercanciaId));
    }

    /**
     * Comportamiento agregar aeropuerto destino
     */
    public void agregarAeropuertoDestino(
            AeropuertoDestinoId aeropuertoDestinoIdId,
            CodigoIcao codigoIcao,
            NombreAeropuerto nombreAeropuerto,
            Pais pais)
    {
        Objects.requireNonNull(aeropuertoDestinoIdId);
        Objects.requireNonNull(codigoIcao);
        Objects.requireNonNull(nombreAeropuerto);
        Objects.requireNonNull(pais);
        appendChange(new AeropuertoDestinoAgregado(aeropuertoDestinoIdId, codigoIcao,
                nombreAeropuerto, pais)).apply();
    }

    /**
     * generar garantia
     */
    public void generarGarantia(GarantiaId entityId, DescripcionGarantia descripcionGarantia){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(descripcionGarantia);
        appendChange(new garantiaGenerada(entityId,descripcionGarantia)).apply();
    }

    /**
     * agregar el encargado de la entrega
     */
    public void agregarEncargadoEntrega(
            EncargadoEntregaId entityId,
            NombreEncargado nombreEncargado,
            Telefono telefono)
    {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombreEncargado);
        Objects.requireNonNull(telefono);
        appendChange(new EncargadoEntregaAgregado(entityId,nombreEncargado,telefono)).apply();

    }

    /**
     * actualizar telefono encargado de entrega
     */
    public void actualizarTelefonoEncargadoEntrega(Integer numero){
        appendChange(new TelefonoEncargadoEntregaActualizado(numero)).apply();
    }

}
