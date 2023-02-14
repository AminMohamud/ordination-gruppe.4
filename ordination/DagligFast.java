package ordination;

import net.bytebuddy.asm.Advice;

import java.sql.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DagligFast extends Ordination {

    private Dosis[] doser = new Dosis[4];

    public DagligFast (LocalDate startDato, LocalDate slutDato, Patient patient, int morgenAntal, int middagAntal, int aftenAntal, int natAntal,) {
        super(startDato, slutDato, patient);
        doser[0] = new Dosis(LocalTime.of(6,00), morgenAntal);
        doser[1] = new Dosis(LocalTime.of(12,00), middagAntal);
        doser[2] = new Dosis(LocalTime.of(18,00), aftenAntal);
        doser[3] = new Dosis(LocalTime.of(23,00), natAntal);
    }
    @Override
    public double samletDosis() {
        return 0;
    }

    @Override
    public double doegnDosis() {
        double doegnDosis = 0;

        if ()


        return 0;
    }

    @Override
    public String getType() {
        return null;
    }
    // TODO
}
