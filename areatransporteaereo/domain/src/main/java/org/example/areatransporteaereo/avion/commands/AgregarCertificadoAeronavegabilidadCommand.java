package org.example.areatransporteaereo.avion.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.avion.values.AvionId;
import org.example.areatransporteaereo.avion.values.CertificadoAeronavegabilidadId;
import org.example.areatransporteaereo.avion.values.CondicionAeronavegabilidad;

public class AgregarCertificadoAeronavegabilidadCommand extends Command {

    private final AvionId avionId;
    private final CertificadoAeronavegabilidadId certificadoAeronavegabilidadId;
    private final CondicionAeronavegabilidad condicionAeronavegabilidad;

    public AgregarCertificadoAeronavegabilidadCommand(AvionId avionId, CertificadoAeronavegabilidadId certificadoAeronavegabilidadId,
                                                      CondicionAeronavegabilidad condicionAeronavegabilidad) {
        this.avionId = avionId;
        this.certificadoAeronavegabilidadId = certificadoAeronavegabilidadId;
        this.condicionAeronavegabilidad = condicionAeronavegabilidad;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public CertificadoAeronavegabilidadId getCertificadoAeronavegabilidadId() {
        return certificadoAeronavegabilidadId;
    }

    public CondicionAeronavegabilidad getCondicionAeronavegabilidad() {
        return condicionAeronavegabilidad;
    }
}
