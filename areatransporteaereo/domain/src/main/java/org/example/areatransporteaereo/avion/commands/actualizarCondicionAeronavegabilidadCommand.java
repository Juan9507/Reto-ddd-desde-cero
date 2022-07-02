package org.example.areatransporteaereo.avion.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.avion.values.CertificadoAeronavegabilidadId;
import org.example.areatransporteaereo.avion.values.Condicion;

public class actualizarCondicionAeronavegabilidadCommand extends Command {
    private final CertificadoAeronavegabilidadId id;
    private final Condicion condicion;

    public actualizarCondicionAeronavegabilidadCommand(CertificadoAeronavegabilidadId id,
                                                       Condicion condicion) {
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
