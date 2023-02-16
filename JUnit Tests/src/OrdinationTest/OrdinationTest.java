package OrdinationTest;

import ordination.DagligFast;
import ordination.Ordination;
import ordination.Patient;
import org.junit.jupiter.api.Test;

import java.net.UnixDomainSocketAddress;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OrdinationTest {


        @Test
        public void TC1_antalDage_12dage() {
            // Arrange
            Patient patient = new Patient("123456-1233", "Børge Bentsen",120);
            DagligFast test = new DagligFast(LocalDate.of(2023,02,01), LocalDate.of(2023,02,11), patient, 1, 2, 3, 4);
            int forventetResultat = 11;

            // Act
            int resultat = test.antalDage();

            // Assert
            assertEquals(forventetResultat, resultat);
        }

        @Test
        public void TC2_antalDage_SammeDag() {
            // Arrange
            Patient patient = new Patient("123456-1233", "Børge Bentsen",120);
            DagligFast test = new DagligFast(LocalDate.of(2023,02,01), LocalDate.of(2023,02,1), patient, 1, 2, 3, 4);
            int forventetResultat = 1;

            // Act
            int resultat = test.antalDage();

            // Assert
            assertEquals(forventetResultat, resultat);
        }



    @Test
    public void TC3_antalDage_NytÅr() {
        // Arrange
        Patient patient = new Patient("123456-1233", "Børge Bentsen",120);
        DagligFast test = new DagligFast(LocalDate.of(2023,02,01), LocalDate.of(2024,02,01), patient, 1, 2, 3, 4);
        int forventetResultat = 365;

        // Act
        int resultat = test.antalDage();

        // Assert
        assertEquals(forventetResultat, resultat);

    }




}
