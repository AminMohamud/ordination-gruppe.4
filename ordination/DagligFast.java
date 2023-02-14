package ordination;

import java.sql.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DagligFast extends Ordination {

    private dose

    public DagligFast (LocalDate startDato, LocalDate slutDato, int morgenAntal, int middagAntal, int aftenAntal, int natAntal,) {
        super();

    }
    public Dosis opretDosis(LocalTime tid, double antal) {
        Dosis dosis = new Dosis(tid, antal);
        doser.add(dosis);
        return dosis;
    }

    public ArrayList<Dosis> getDoser() {
        return doser;
    }

    public void setDoser(ArrayList<Dosis> doser) {
        this.doser = doser;
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
