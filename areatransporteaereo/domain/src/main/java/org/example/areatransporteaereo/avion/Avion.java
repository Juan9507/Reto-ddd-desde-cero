package org.example.areatransporteaereo.avion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.events.*;
import org.example.areatransporteaereo.avion.values.*;

import java.util.List;
import java.util.Objects;

/**
 * Agregado root
 *
 * @author Juan David Rivera <juandavidnaranjo75@gmail.com/>
 * @since [1.0.0]
 * @version [1.0.0]
 */
public class Avion extends AggregateEvent<AvionId> {

    //Objeto de valor
    protected TipoDeAvion tipoDeAvion;
    //Entidad
    protected CertificadoAeronavegabilidad certificadoAereonavegabilidad;
    //Entidad
    protected Piloto piloto;
    //Entidad
    protected Contenedor contenedor;

    public Avion(AvionId avionId, TipoDeAvion tipoDeAvion) {
        super(avionId);
        //Envento
        appendChange(new AvionCreado(tipoDeAvion)).apply();
        subscribe(new AvionEventChange(this));
    }

    private Avion(AvionId avionId) {
        super(avionId);
        subscribe(new AvionEventChange(this));
    }

    /**
     * Comportamiento agregar piloto
     * @param entityId
     * @param licencia
     * @param nombre
     */
    public void agregarPiloto(PilotoId entityId, Licencia licencia, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(licencia);
        Objects.requireNonNull(nombre);
        appendChange(new PilotoAgregado(entityId,licencia,nombre)).apply();

    }

    /**
     * Agregar un contenedor
     * @param contenedorId
     * @param cargaMaxima
     * @param longitud
     * @param peso
     */
    public void agregarContenedor(
            ContenedorId contenedorId,
            CargaMaxima cargaMaxima,
            Longitud longitud,
            Peso peso)
    {
        Objects.requireNonNull(contenedorId);
        Objects.requireNonNull(cargaMaxima);
        Objects.requireNonNull(longitud);
        Objects.requireNonNull(peso);
        appendChange(new ContenedorAgregado(contenedorId,cargaMaxima,longitud,peso)).apply();
    }

    /**
     * Comportamiento agregarCertificadoAeronavegabilidad
     * @param id
     * @param condicionAeronavegabilidad
     */
    public void agregarCertificadoAeronavegabilidad(
            CertificadoAeronavegabilidadId id,
            CondicionAeronavegabilidad condicionAeronavegabilidad)
    {
        Objects.requireNonNull(id);
        Objects.requireNonNull(condicionAeronavegabilidad);
        appendChange(new CertificadoAeronavegabilidadAgregado(id,condicionAeronavegabilidad)).apply();

    }

    /**
     * Comportamieto actualizar condicion
     * @param id
     * @param condicion
     */
    public void actualizarCondicionAeronavegabilidad(
            CertificadoAeronavegabilidadId id,
            Condicion condicion)
    {
        Objects.requireNonNull(id);
        Objects.requireNonNull(condicion);
        appendChange(new CondicionAeronavegabilidadActualizada(id,condicion)).apply();
    }

    /**
     * Comportamiento actualizar piloto
     * @param entityId
     * @param nombre
     */
    public void actualizarNombrePiloto(PilotoId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreDelPilotoActualizado(entityId,nombre)).apply();
    }

    /**
     * Comportamiento actualizar estado licencia del piloto
     * @param entityId
     * @param estado
     */
    public void actualizarEstadoLicenciaDelPiloto(PilotoId entityId, Estado estado){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(estado);
        appendChange(new EstadoLicenciaDelPílotoActualizado(entityId,estado)).apply();
    }

    public Contenedor getcontenedor() {
        return contenedor;
    }

    public static Avion from(AvionId avionId, List<DomainEvent> events){
        var avion = new Avion(avionId);
        events.forEach(avion::applyEvent);
        return avion;
    }

}
