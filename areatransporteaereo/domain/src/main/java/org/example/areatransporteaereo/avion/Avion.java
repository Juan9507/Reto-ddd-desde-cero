package org.example.areatransporteaereo.avion;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.areatransporteaereo.avion.values.AvionId;
import org.example.areatransporteaereo.avion.values.CertificadoAeronavegabilidadId;
import org.example.areatransporteaereo.avion.values.TipoDeAvion;

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
    }

}
