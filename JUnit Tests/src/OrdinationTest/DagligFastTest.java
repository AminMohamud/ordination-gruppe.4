package OrdinationTest;


import ordination.DagligFast;
import ordination.Patient;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DagligFastTest {

    @org.junit.jupiter.api.Test

    // TestCase 1: Patient(111111-1111, Anders, 80,0kg)
    void samletDosis1() {

        //Arrange
        Patient patient = new Patient("111111-1111","Anders",80);
        DagligFast dagligFast = new DagligFast(LocalDate.of(2023,2,1),LocalDate.of(2023,2,8),patient, 0,0,1,0);

        //Act
        double forventetdoegnDosis = dagligFast.samletDosis();

        //Assert
        double actual = (8);
        assertEquals(actual, forventetdoegnDosis);
    }

    @org.junit.jupiter.api.Test
    void doegnDosis1() {

        // Arrange
        Patient patient = new Patient("111111-1111","Anders",80);
        DagligFast dagligFast = new DagligFast(LocalDate.of(2023,2,1),LocalDate.of(2023,2,8), patient, 0,0,1,0);

        // Act
        double actual = dagligFast.doegnDosis();

        //Assert
        double expected = (1);
        assertEquals(expected,actual);

    }

    @org.junit.jupiter.api.Test
        //TestCase 2
    void samletDosis2() {

        //Arrange
        Patient patient = new Patient("111111-1111","Anders",80);
        DagligFast dagligFast = new DagligFast(LocalDate.of(2023,2,1),LocalDate.of(2023,2,15),patient, 5,7,10,0);

        //Act
        double forventetdoegnDosis = dagligFast.samletDosis();

        //Assert
        double actual = (330);
        assertEquals(actual, forventetdoegnDosis);
    }
    @org.junit.jupiter.api.Test

    void doegnDosis2() {

        // Arrange
        Patient patient = new Patient("111111-1111","Anders",80);
        DagligFast dagligFast = new DagligFast(LocalDate.of(2023,2,1),LocalDate.of(2023,2,15),patient, 5,7,10,0);

        // Act
        double actual = dagligFast.doegnDosis();

        //Assert
        double expected = (22);
        assertEquals(expected,actual);

    }
    @org.junit.jupiter.api.Test
        //TestCase 3

    void samletDosis3() {

        //Arrange
        Patient patient = new Patient("111111-1111","Anders",80);
        DagligFast dagligFast = new DagligFast(LocalDate.of(2023,2,5),LocalDate.of(2023,2,15),patient, 1,2,0,1);

        //Act
        double forventetdoegnDosis = dagligFast.samletDosis();

        //Assert
        double actual = (44);
        assertEquals(actual, forventetdoegnDosis);
    }

    @org.junit.jupiter.api.Test

    void doegnDosis3() {

        // Arrange
        Patient patient = new Patient("111111-1111","Anders",80);
        DagligFast dagligFast = new DagligFast(LocalDate.of(2023,2,5),LocalDate.of(2023,2,15),patient, 1,2,0,1);

        // Act
        double actual = dagligFast.doegnDosis();

        //Assert
        double expected = (4);
        assertEquals(expected,actual);
    }

    //Test 4 med Exception
    @org.junit.jupiter.api.Test

    void samletDosis5()  {

        //Arrange
        Patient patient = new Patient("111111-1111","Anders",80);
        DagligFast dagligFast = new DagligFast(LocalDate.of(2023,1,31),LocalDate.of(2023,2,10),patient, 1,0,1,2);

        //Act
        double forventetdoegnDosis = dagligFast.samletDosis();

        //Assert
        double actual = (44);
        assertEquals(actual, forventetdoegnDosis);

    }
    @org.junit.jupiter.api.Test
    void doegnDosis5() {

        // Arrange
        Patient patient = new Patient("111111-1111","Anders",80);
        DagligFast dagligFast = new DagligFast(LocalDate.of(2023,1,31),LocalDate.of(2023,2,10),patient, 1,0,1,2);

        // Act
        double actual = dagligFast.doegnDosis();

        //Assert
        double expected = (4);
        assertEquals(expected,actual);
    }
}

