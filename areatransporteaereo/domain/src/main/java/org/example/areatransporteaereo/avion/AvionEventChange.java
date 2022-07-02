package org.example.areatransporteaereo.avion;

import co.com.sofka.domain.generic.EventChange;
import org.example.areatransporteaereo.avion.events.AvionCreado;
import org.example.areatransporteaereo.avion.events.CertificadoAeronavegabilidadAgregado;
import org.example.areatransporteaereo.avion.events.CondicionAeronavegabilidadActualizada;

public class AvionEventChange extends EventChange {
    public AvionEventChange(Avion avion) {
        apply((AvionCreado event) -> {
            avion.certificadoAereonavegabilidad = null;
            avion.contenedor = null;
            avion.piloto = null;
            avion.tipoDeAvion = event.getTipoDeAvion();
        });

        apply((CondicionAeronavegabilidadActualizada event) -> {
            avion.certificadoAereonavegabilidad.actualizarCondicion(event.getCondicion());
        });

        apply((CertificadoAeronavegabilidadAgregado event) -> {
            avion.certificadoAereonavegabilidad = new CertificadoAeronavegabilidad(event.getId(), event.getCondicionAeronavegabilidad());
        });
    }
}
