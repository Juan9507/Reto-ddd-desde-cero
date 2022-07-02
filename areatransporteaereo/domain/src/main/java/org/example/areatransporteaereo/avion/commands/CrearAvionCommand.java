package org.example.areatransporteaereo.avion.commands;

import co.com.sofka.domain.generic.Command;
import org.example.areatransporteaereo.avion.values.AvionId;
import org.example.areatransporteaereo.avion.values.TipoDeAvion;

public class CrearAvionCommand extends Command {

    private final AvionId avionId;
    private final TipoDeAvion tipoDeAvion;

    public CrearAvionCommand(AvionId avionId, TipoDeAvion tipoDeAvion) {
        this.avionId = avionId;
        this.tipoDeAvion = tipoDeAvion;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public TipoDeAvion getTipoDeAvion() {
        return tipoDeAvion;
    }
}
