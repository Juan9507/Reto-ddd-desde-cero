package org.example.areatransporteaereo.mercancia;

import co.com.sofka.domain.generic.Entity;
import org.example.areatransporteaereo.mercancia.values.ImportacionExportacion;
import org.example.areatransporteaereo.mercancia.values.OperacionId;
import org.example.areatransporteaereo.mercancia.values.TipoImportacion;

public class Operacion extends Entity<OperacionId> {

    //Objeto de valor
    private ImportacionExportacion importacionExportacion;

    public Operacion(OperacionId entityId, ImportacionExportacion importacionExportacion) {
        super(entityId);
        this.importacionExportacion = importacionExportacion;
    }

    public void actaulizarTipoDeImportacionExportacion(TipoImportacion tipoImportacion){
        this.importacionExportacion = importacionExportacion.actualizarTipo(tipoImportacion);
    }

}
