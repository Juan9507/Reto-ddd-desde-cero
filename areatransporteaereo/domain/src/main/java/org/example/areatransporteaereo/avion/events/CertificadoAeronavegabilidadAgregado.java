package org.example.areatransporteaereo.avion.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.values.CertificadoAeronavegabilidadId;
import org.example.areatransporteaereo.avion.values.CondicionAeronavegabilidad;

public class CertificadoAeronavegabilidadAgregado extends DomainEvent {
    private final CertificadoAeronavegabilidadId id;
    private final CondicionAeronavegabilidad condicionAeronavegabilidad;

    public CertificadoAeronavegabilidadAgregado(CertificadoAeronavegabilidadId id,
                                                CondicionAeronavegabilidad condicionAeronavegabilidad) {
        super("org.example.areatransporteaereo.CertificadoAeronavegabilidadAgregado");
        this.id = id;
        this.condicionAeronavegabilidad = condicionAeronavegabilidad;
    }

    public CertificadoAeronavegabilidadId getId() {
        return id;
    }

    public CondicionAeronavegabilidad getCondicionAeronavegabilidad() {
        return condicionAeronavegabilidad;
    }
}
