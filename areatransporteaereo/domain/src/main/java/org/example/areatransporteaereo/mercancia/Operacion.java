package org.example.areatransporteaereo.mercancia;

import co.com.sofka.domain.generic.Entity;
import org.example.areatransporteaereo.mercancia.values.ImportacionExportacion;
import org.example.areatransporteaereo.mercancia.values.OperacionId;

public class Operacion extends Entity<OperacionId> {

    //Objeto de valor
    private ImportacionExportacion importacionExportacion;

    public Operacion(OperacionId entityId) {
        super(entityId);
    }
}
