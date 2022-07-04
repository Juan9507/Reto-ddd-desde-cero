package org.example.areatransporteaereo.avion;

import co.com.sofka.domain.generic.EventChange;
import org.example.areatransporteaereo.avion.events.*;

public class AvionEventChange extends EventChange {
    public AvionEventChange(Avion avion) {
        apply((AvionCreado event) -> {
            avion.certificadoAereonavegabilidad = null;
            avion.contenedor = null;
            avion.piloto = null;
            avion.tipoDeAvion = event.getTipoDeAvion();
        });

        /**
         * Agregar piloto
         */
        apply((PilotoAgregado event) -> {
            avion.piloto = new Piloto(event.getEntityId(), event.getLicencia(),event.getNombre());
        });

        /**
         * Agregar un contenedor al avion
         */
        apply((ContenedorAgregado event) -> {
            avion.contenedor = new Contenedor(
                    event.getContenedorId(),
                    event.getCargaMaxima(),
                    event.getLongitud(),
                    event.getPeso()
            );
        });

        /**
         * Agregar certificado de aeronavegabilidad
         */
        apply((CertificadoAeronavegabilidadAgregado event) -> {
            avion.certificadoAereonavegabilidad = new CertificadoAeronavegabilidad(
                    event.getId(),
                    event.getCondicionAeronavegabilidad()
            );
        });

        /**
         * Actualizar condicion
         */
        apply((CondicionAeronavegabilidadActualizada event) -> {
            avion.certificadoAereonavegabilidad.actualizarCondicion(event.getCondicion());
        });

        /**
         * Actualizar nombre del piloto
         */
        apply((NombreDelPilotoActualizado event) -> {
            avion.piloto.actualizarNombre(event.getNombre());
        });

        /**
         * Actualizar estado de la licencia del piloto
         */
        apply((EstadoLicenciaDelPílotoActualizado event) -> {
            avion.piloto.actualizarEstadoLiciencia(event.getEstado());
        });
    }
}
