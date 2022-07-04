package org.example.areatransporteaereo.avion.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.avion.values.AvionId;
import org.example.areatransporteaereo.avion.values.CertificadoAeronavegabilidadId;
import org.example.areatransporteaereo.avion.values.Condicion;

public class ActualizarCondicionAeronavegabilidadCommand extends Command {
    private final AvionId avionId;
    private final CertificadoAeronavegabilidadId id;
    private final Condicion condicion;

    public ActualizarCondicionAeronavegabilidadCommand(AvionId avionId, CertificadoAeronavegabilidadId id,
                                                       Condicion condicion) {
        this.avionId = avionId;
        this.id = id;
        this.condicion = condicion;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public CertificadoAeronavegabilidadId getId() {
        return id;
    }

    public Condicion getCondicion() {
        return condicion;
    }
}
