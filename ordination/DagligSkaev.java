package ordination;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class DagligSkaev extends Ordination {

    private ArrayList<Dosis> doser = new ArrayList<>();
    private LocalDate startDato;
    private LocalDate slutDato;

    public DagligSkaev(LocalDate startDato, LocalDate slutDato, Patient patient) {
        super(startDato, slutDato, patient);
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public Dosis opretDosis(LocalTime tid, double antal, Patient patient) {
        Dosis dosis = new Dosis(tid, antal);
        doser.add(dosis);
        return dosis;
    }

    @Override
    public double samletDosis() {
        long daysbetween = ChronoUnit.DAYS.between(startDato,slutDato);
        return doegnDosis() * daysbetween;
    }

    @Override
    public double doegnDosis() {
        double result = 0;
        for (Dosis dos : doser) {
            result += dos.getAntal();
        }
        return result;
    }

    @Override
    public String getType() {
        return null;
    }
}
