package org.example.areatransporteaereo.avion.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.areatransporteaereo.avion.values.CertificadoAeronavegabilidadId;
import org.example.areatransporteaereo.avion.values.Condicion;

public class CondicionAeronavegabilidadActualizada extends DomainEvent {
    private final CertificadoAeronavegabilidadId id;
    private final Condicion condicion;


    public CondicionAeronavegabilidadActualizada(CertificadoAeronavegabilidadId id, Condicion condicion) {
        super("org.example.areatransporteaereo.CondicionAeronavegabilidadActualizada");
        this.id = id;
        this.condicion = condicion;
    }

    public CertificadoAeronavegabilidadId getId() {
        return id;
    }

    public Condicion getCondicion() {
        return condicion;
    }
}
