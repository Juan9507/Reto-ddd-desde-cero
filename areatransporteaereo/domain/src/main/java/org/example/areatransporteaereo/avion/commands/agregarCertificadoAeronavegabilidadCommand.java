package org.example.areatransporteaereo.avion.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.avion.values.CertificadoAeronavegabilidadId;
import org.example.areatransporteaereo.avion.values.CondicionAeronavegabilidad;

public class agregarCertificadoAeronavegabilidadCommand extends Command {

    private final CertificadoAeronavegabilidadId certificadoAeronavegabilidadId;
    private final CondicionAeronavegabilidad condicionAeronavegabilidad;

    public agregarCertificadoAeronavegabilidadCommand(CertificadoAeronavegabilidadId certificadoAeronavegabilidadId,
                                                      CondicionAeronavegabilidad condicionAeronavegabilidad) {
        this.certificadoAeronavegabilidadId = certificadoAeronavegabilidadId;
        this.condicionAeronavegabilidad = condicionAeronavegabilidad;
    }

    public CertificadoAeronavegabilidadId getCertificadoAeronavegabilidadId() {
        return certificadoAeronavegabilidadId;
    }

    public CondicionAeronavegabilidad getCondicionAeronavegabilidad() {
        return condicionAeronavegabilidad;
    }
}
