package ordination;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class PN extends Ordination {
    private double antalEnheder;
    private ArrayList<LocalDate> datoer;

    public PN(LocalDate startDen, LocalDate slutDen, double antalEnheder, Patient patient) {
        super(startDen, slutDen, patient);
        this.antalEnheder = antalEnheder;
        datoer = new ArrayList<>();
    }


    /**
     * Registrerer at der er givet en dosis paa dagen givesDen
     * Returnerer true hvis givesDen er inden for ordinationens gyldighedsperiode og datoen huskes
     * Retrurner false ellers og datoen givesDen ignoreres
     * @param givesDen
     * @return
     */
    public boolean givDosis(LocalDate givesDen) {
        if (givesDen.isAfter(super.getStartDen().minusDays(1)) && givesDen.isBefore(getSlutDen().plusDays(1)) && !datoer.contains(givesDen)) {
            datoer.add(givesDen);
            return true;
        }
        return false;
    }

    public double doegnDosis() {
        if (datoer.size() == 0) {
            return 0;
        } else {
            return (antalEnheder * datoer.size()) / (1.00 * (1+ ChronoUnit.DAYS.between(datoer.get(0), datoer.get(datoer.size() - 1))));
        }
    }

    @Override
    public String getType() {
        return "PN";
    }


    public double samletDosis() {
        return doegnDosis() * antalDage();
    }

    /**
     * Returnerer antal gange ordinationen er anvendt
     * @return
     */
    public int getAntalGangeGivet() {
        int antalGangeGivet = 0;
        for (int i = 0; i < datoer.size(); i++) {
            antalGangeGivet += 1;
        }
        return antalGangeGivet;
    }

    public double getAntalEnheder() {
        return antalEnheder;
    }

}
