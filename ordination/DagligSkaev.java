package ordination;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DagligSkaev extends Ordination {

    private ArrayList<Dosis> doser = new ArrayList<>();

    public DagligSkaev(LocalDate startDato, LocalDate slutDato, Patient patient) {
        super(startDato,slutDato,patient);
        doser = new ArrayList<>(doser);
    }

    public Dosis opretDosis(LocalTime tid, double antal, Patient patient) {
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
}
