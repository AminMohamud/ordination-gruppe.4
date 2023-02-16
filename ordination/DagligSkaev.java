package ordination;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DagligSkaev extends Ordination {

    private ArrayList<Dosis> doser = new ArrayList<>();
    private LocalDate startDato;
    private LocalDate slutDato;

    public DagligSkaev(LocalDate startDato, LocalDate slutDato, Patient patient, LocalTime[] klokkeSlet, double[] antalEnheder) {
        super(startDato, slutDato, patient);
        this.startDato = startDato;
        this.slutDato = slutDato;
        for (int i = 0; i < klokkeSlet.length; i++) {
            opretDosis(klokkeSlet[i], antalEnheder[i]);
        }
    }


    public Dosis opretDosis(LocalTime tid, double antal) {
        Dosis dosis = new Dosis(tid, antal);
        doser.add(dosis);
        return dosis;
    }

    @Override
    public double samletDosis() {
        return doegnDosis() * super.antalDage();
    }

    @Override
    public double doegnDosis() {
        double result = 0;
        for (Dosis dos : doser) {
            result += dos.getAntal();
        }
        return result;
    }

    public ArrayList<Dosis> getDoser() {
        return doser;
    }

    @Override
    public String getType() {
        return "DagligSkaev";
    }
}
