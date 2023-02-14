package ordination;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DagligFast extends Ordination {

    ArrayList<Dosis> doser = new ArrayList<>();

    public DagligFast (LocalDate startDato, LocalDate slutDato, Patient patient) {
        super();
        doser = new ArrayList<>();
    }
    public Dosis opretDosis(LocalTime tid, double antal) {
        Dosis dosis = new Dosis(tid, antal);
        doser.add(dosis);
        return dosis;
    }
    @Override
    public double samletDosis() {
        return 0;
    }

    @Override
    public double doegnDosis() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }
    // TODO
}
