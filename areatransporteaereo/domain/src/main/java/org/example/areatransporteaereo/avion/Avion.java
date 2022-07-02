package org.example.areatransporteaereo.avion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.events.AvionCreado;
import org.example.areatransporteaereo.avion.events.CertificadoAeronavegabilidadAgregado;
import org.example.areatransporteaereo.avion.events.CondicionAeronavegabilidadActualizada;
import org.example.areatransporteaereo.avion.values.*;

import java.util.List;

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

    //Comportamiento agregarCertificadoAeronavegabilidad
    public void agregarCertificadoAeronavegabilidad(CertificadoAeronavegabilidadId id,
                                             CondicionAeronavegabilidad condicionAeronavegabilidad){
        appendChange(new CertificadoAeronavegabilidadAgregado(id,condicionAeronavegabilidad)).apply();

    }

    //Comportamieto actualizar condicion
    public void actualizarCondicionAeronavegabilidad(CertificadoAeronavegabilidadId id,
                                                     Condicion condicion){
        appendChange(new CondicionAeronavegabilidadActualizada(id,condicion)).apply();
    }

    public static Avion from(AvionId avionId, List<DomainEvent> events){
        var avion = new Avion(avionId);
        events.forEach(avion::applyEvent);
        return avion;
    }

}
