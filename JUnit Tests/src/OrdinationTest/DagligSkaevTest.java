package OrdinationTest;

import ordination.DagligSkaev;
import ordination.Dosis;
import ordination.Ordination;
import ordination.Patient;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class DagligSkaevTest {



    @Test
    public void TC1_dagligSkaev_doegndosis4() {
        Patient patient = new Patient("123456-1235", "Bent Børgesen",150);
        LocalDate startDato = LocalDate.of(2023, 1, 1);
        LocalDate slutDato = LocalDate.of(2023, 1, 7);
        LocalTime[] klokkeSlet = {LocalTime.of(7, 35), LocalTime.of(13, 35), LocalTime.of(19, 35)};
        double[] antalEnheder = {1.0, 1.0, 2.0};

        DagligSkaev ordination = new DagligSkaev(startDato, slutDato, patient, klokkeSlet, antalEnheder);

        double expectedDoegnDosis = 4.0;
        double actualDoegnDosis = ordination.doegnDosis();

        assertEquals(expectedDoegnDosis, actualDoegnDosis, 0.0001);}

    @Test
    public void TC1_dagligSkaev_samletdosis28() {
        // Opret en patient
        Patient patient = new Patient("123456-1235", "Bent Børgesen",150);

        // Opret en ordination
        LocalDate startDato = LocalDate.of(2023, 1, 1);
        LocalDate slutDato = LocalDate.of(2023, 1, 7);
        LocalTime[] klokkeSlet = {LocalTime.of(7, 35), LocalTime.of(13, 35), LocalTime.of(19, 35)};
        double[] antalEnheder = {1.0, 1.0, 2.0};
        DagligSkaev ordination = new DagligSkaev(startDato, slutDato, patient, klokkeSlet, antalEnheder);

        // Test samlet dosis
        double expectedSamletDosis = 28.0;
        double actualSamletDosis = ordination.samletDosis();
        assertEquals(expectedSamletDosis, actualSamletDosis, 0.0001);
    }

    @Test
    public void TC2_dagligSkaev_doegndosisMereEnd4() {
        Patient patient = new Patient("123456-1235", "Bent Børgesen",150);
        LocalDate startDato = LocalDate.of(2023, 2, 5);
        LocalDate slutDato = LocalDate.of(2023, 2, 15);
        LocalTime[] klokkeSlet = {LocalTime.of(9, 00), LocalTime.of(12, 30), LocalTime.of(19, 00)};
        double[] antalEnheder = {1.0, 2.0, 2.0,1.0};

        DagligSkaev ordination = new DagligSkaev(startDato, slutDato, patient, klokkeSlet, antalEnheder);

        double expectedDoegnDosis = 6.0;
        double actualDoegnDosis = ordination.doegnDosis();

        assertEquals(expectedDoegnDosis, actualDoegnDosis, 0.0001);}

    @Test
    public void TC2_dagligSkaev_samletdosis54() {

        Patient patient = new Patient("123456-1235", "Bent Børgesen",150);


        LocalDate startDato = LocalDate.of(2023, 2, 1);
        LocalDate slutDato = LocalDate.of(2023, 2, 10);
        LocalTime[] klokkeSlet = {LocalTime.of(9, 00), LocalTime.of(12, 30), LocalTime.of(19, 00),LocalTime.of(23, 59)};
        double[] antalEnheder = {1.0, 2.0, 2.0,1.0};
        DagligSkaev ordination = new DagligSkaev(startDato, slutDato, patient, klokkeSlet, antalEnheder);

        double expectedSamletDosis = 60.0;
        double actualSamletDosis = ordination.samletDosis();
        assertEquals(expectedSamletDosis, actualSamletDosis, 0.0001);}



    @Test
    public void TC7_dagligSkaev_doegndosisEndOfYear() {
        Patient patient = new Patient("123456-1235", "Bent Børgesen",150);
        LocalDate startDato = LocalDate.of(2023, 12, 24);
        LocalDate slutDato = LocalDate.of(2023, 12, 31);
        LocalTime[] klokkeSlet = {LocalTime.of(8, 00), LocalTime.of(12, 00), LocalTime.of(18, 00)};
        double[] antalEnheder = {1.0, 1.0, 2.0};

        DagligSkaev ordination = new DagligSkaev(startDato, slutDato, patient, klokkeSlet, antalEnheder);

        double expectedDoegnDosis = 4.0;
        double actualDoegnDosis = ordination.doegnDosis();

        assertEquals(expectedDoegnDosis, actualDoegnDosis, 0.0001);}

    @Test
    public void TC7_dagligSkaev_samletdosisEndOfYear() {
        Patient patient = new Patient("123456-1235", "Bent Børgesen",150);
        LocalDate startDato = LocalDate.of(2023, 12, 24);
        LocalDate slutDato = LocalDate.of(2023, 12, 31);
        LocalTime[] klokkeSlet = {LocalTime.of(8, 00), LocalTime.of(12, 00), LocalTime.of(18, 00)};
        double[] antalEnheder = {1.0, 1.0, 2.0};

        DagligSkaev ordination = new DagligSkaev(startDato, slutDato, patient, klokkeSlet, antalEnheder);

        double expectedSamletDosis = 28.0;
        double actualSamletDosis = ordination.samletDosis();
        assertEquals(expectedSamletDosis, actualSamletDosis, 0.0001);}


}

