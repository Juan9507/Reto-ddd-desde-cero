package org.example.areatransporteaereo.avion.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.avion.values.AvionId;
import org.example.areatransporteaereo.avion.values.Licencia;
import org.example.areatransporteaereo.avion.values.Nombre;
import org.example.areatransporteaereo.avion.values.PilotoId;

public class AgregarPilotoCommand extends Command {
    private final AvionId avionId;
    private final PilotoId entityId;
    private final Licencia licencia;
    private final Nombre nombre;

    public AgregarPilotoCommand(
            AvionId avionId,
            PilotoId entityId,
            Licencia licencia,
            Nombre nombre)
    {

        this.avionId = avionId;
        this.entityId = entityId;
        this.licencia = licencia;
        this.nombre = nombre;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public PilotoId getEntityId() {
        return entityId;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
