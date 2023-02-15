package ordination;

import gui.StartVindue;
import net.bytebuddy.asm.Advice;

import java.sql.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import static java.time.temporal.ChronoUnit.DAYS;

public class DagligFast extends Ordination {

    private Dosis[] doser = new Dosis[4];
    private LocalDate startDato;
    private LocalDate slutDato;

    public DagligFast (LocalDate startDato, LocalDate slutDato, Patient patient, double morgenAntal, double middagAntal, double aftenAntal, double natAntal) {
        super(startDato, slutDato, patient);
        this.startDato = startDato;
        this.slutDato = slutDato;
        doser[0] = new Dosis(LocalTime.of(6,00), morgenAntal);
        doser[1] = new Dosis(LocalTime.of(12,00), middagAntal);
        doser[2] = new Dosis(LocalTime.of(18,00), aftenAntal);
        doser[3] = new Dosis(LocalTime.of(23,00), natAntal);
    }

    public Dosis[] getDoser() {
        return doser;
    }

    @Override
    public double samletDosis() {
        return super.antalDage() * doegnDosis();
    }

    @Override
    public double doegnDosis() {
        double doegnDosis = 0;
        for (int i = 0; i <= doser.length; i++) {
            doegnDosis =+ doser[i].getAntal();
        }
        return doegnDosis;
    }

    @Override
    public String getType() {
        return "dagligFast";
    }
    // TODO
}
