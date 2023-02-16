package OrdinationTest;


import ordination.DagligFast;
import ordination.Patient;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DagligFastTest {

    @org.junit.jupiter.api.Test
    void samletDosis_Test1() {

        //Arrange
        Patient patient = new Patient("1342121031","Anders",70.1);
        DagligFast dagligFast = new DagligFast(LocalDate.of(2023,02,10),LocalDate.of(2023,02,15),patient, 1,3,4,1);

        //Act
        double forventetdoegnDosis = dagligFast.samletDosis();

        //Assert
        double actual = (54);
        assertEquals(actual, forventetdoegnDosis);






    }

    @org.junit.jupiter.api.Test
    void doegnDosis() {

        // Arrange
        Patient patient = new Patient("1342121031","Anders",70.1);
        DagligFast dagligFast = new DagligFast(LocalDate.of(2023,02,10),LocalDate.of(2023,02,15),patient, 1,3,4,1);

        // Act
        double actual = dagligFast.doegnDosis();

        //Assert
        double expected = (9);
        assertEquals(expected,actual);

    }
}