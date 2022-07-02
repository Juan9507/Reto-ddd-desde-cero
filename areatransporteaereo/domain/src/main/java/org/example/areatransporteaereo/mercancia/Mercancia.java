package org.example.areatransporteaereo.mercancia;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.mercancia.events.MercanciaCreada;
import org.example.areatransporteaereo.mercancia.events.descripcionClasificacionCambiada;
import org.example.areatransporteaereo.mercancia.events.operacionAgregada;
import org.example.areatransporteaereo.mercancia.values.*;

import java.util.List;

public class Mercancia extends AggregateEvent<MercanciaId> {

    //Entidad
    protected Clasificacion clasificacion;
    //Entidad
    protected Operacion operacion;
    //Entidad
    protected Remitente remitente;

    public Mercancia(MercanciaId mercanciaId, ClasificacionId clasificacionId,
                     Descripcion descripcion, RemitenteId remitenteId,
                     TipoDeMercancia tipoDeMercancia, Nombre nombre,
                     Identidad identidad, Destinario destinario) {
        super(mercanciaId);
        appendChange(new MercanciaCreada(clasificacionId,remitenteId,
                descripcion,tipoDeMercancia,nombre,identidad,destinario)).apply();
        subscribe(new MercanciaEventChange(this));
    }

    private Mercancia(MercanciaId mercanciaId){
        super(mercanciaId);
        subscribe(new MercanciaEventChange(this));
    }

    public void cambiarDescripcioDeClasificacion(Clasificacion clasificacion){
        appendChange(new descripcionClasificacionCambiada(clasificacion)).apply();
    }

    public void agregarOperacion(OperacionId operacionId, ImportacionExportacion importacionExportacion){
        appendChange(new operacionAgregada(operacionId,importacionExportacion));
    }

    public static Mercancia from(MercanciaId mercanciaId, List<DomainEvent> events){
        var mercancia = new Mercancia(mercanciaId);
        events.forEach(mercancia::applyEvent);
        return mercancia;
    }
}
