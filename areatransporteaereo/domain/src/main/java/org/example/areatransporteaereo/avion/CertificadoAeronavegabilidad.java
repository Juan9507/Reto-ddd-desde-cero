package org.example.areatransporteaereo.avion;

import co.com.sofka.domain.generic.Entity;
import org.example.areatransporteaereo.avion.values.CertificadoAeronavegabilidadId;
import org.example.areatransporteaereo.avion.values.Condicion;
import org.example.areatransporteaereo.avion.values.CondicionAeronavegabilidad;

public class CertificadoAeronavegabilidad extends Entity<CertificadoAeronavegabilidadId> {

    private CondicionAeronavegabilidad condicionAeronavegabilidad;

    public CertificadoAeronavegabilidad(CertificadoAeronavegabilidadId id,
                                        CondicionAeronavegabilidad condicionAeronavegabilidad) {
        super(id);
        this.condicionAeronavegabilidad = condicionAeronavegabilidad;
    }

    /**
     * Comportamiento Actualizar condicion
     */
    public void actualizarCondicion(Condicion condicion){
        this.condicionAeronavegabilidad = condicionAeronavegabilidad.ActualizaCondicion(condicion);
    }
}
