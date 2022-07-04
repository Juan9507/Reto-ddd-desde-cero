package org.example.areatransporteaereo.mercancia;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.events.*;
import org.example.areatransporteaereo.mercancia.values.FechaCreacion;
import org.example.areatransporteaereo.mercancia.values.*;

import java.util.List;

public class Mercancia extends AggregateEvent<MercanciaId> {

    //Objeto de valor
    protected FechaCreacion fechaCreacion;
    //Entidad
    protected Clasificacion clasificacion;
    //Entidad
    protected Operacion operacion;
    //Entidad
    protected Remitente remitente;

    public Mercancia(MercanciaId mercanciaId, FechaCreacion fechaCreacion) {
        super(mercanciaId);
        appendChange(new MercanciaCreada(fechaCreacion)).apply();
        subscribe(new MercanciaEventChange(this));
    }

    private Mercancia(MercanciaId mercanciaId) {
        super(mercanciaId);
        subscribe(new MercanciaEventChange(this));
    }

    public static Mercancia from(MercanciaId mercanciaId, List<DomainEvent> events) {
        var mercancia = new Mercancia(mercanciaId);
        events.forEach(mercancia::applyEvent);
        return mercancia;
    }


    /**
     * Agregar clasificacion
     */
    public void agregarClasificacion(
            ClasificacionId entityId,
            Descripcion descripcion,
            TipoDeMercancia tipoDeMercancia) {
        appendChange(new ClasificacionAgregada(entityId, descripcion, tipoDeMercancia)).apply();
    }

    /**
     * Agregar operacion
     */
    public void agregarOperacionMercancia(
            OperacionId entityId,
            ImportacionExportacion importacionExportacion) {
        appendChange(new OperacionMercanciaAgregada(entityId, importacionExportacion)).apply();
    }

    /**
     * Agregar Remitente
     *
     * @param entityId
     * @param nombre
     * @param identidad
     */
    public void agregarRemitente(
            RemitenteId entityId,
            Nombre nombre,
            Identidad identidad,
            Destinario destinario) {
        appendChange(new RemitenteAgregado(entityId, nombre, identidad, destinario)).apply();
    }

    /**
     * Comportamiento para cambiar la descripcion de clasificacion
     *
     * @param entityId
     * @param descripcion
     */
    public void cambiarDescripcionDeClasificacion(
            ClasificacionId entityId,
            Descripcion descripcion) {
        appendChange(new DescripcionDeClasificacionCambiada(entityId, descripcion)).apply();
    }

    /**
     * Actualizar tipo de operacion importacion exportacion
     *
     * @param entityId
     * @param tipoImportacion
     */
    public void actulizarTipoDeOperacionImportacionExportacion(
            OperacionId entityId,
            TipoImportacion tipoImportacion) {
        appendChange(new TipoDeOperacionImportacionExportacionActualizada(entityId, tipoImportacion)).apply();
    }

    /**
     * Comportamiento para cambiar los datos del remitentente el destinario
     *
     * @param entityId
     * @param datosPersona
     */
    public void cambiarDatosRemitenteDelDestinario(
            RemitenteId entityId,
            DatosPersona datosPersona) {
        appendChange(new DatosRemitenteDelDestinarioCambiado(entityId, datosPersona)).apply();
    }
}
