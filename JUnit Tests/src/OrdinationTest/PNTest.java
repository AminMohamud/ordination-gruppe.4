package OrdinationTest;

import ordination.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PNTest {

    @Test
    void givDosisTC1() {
        //Arrange
        Patient subject = new Patient("111111-1111", "Anders And", 80.00);
        PN test = new PN(LocalDate.of(23, 2,1), LocalDate.of(23,2,10), 1.00, subject);
        LocalDate givenDate = LocalDate.of(23,2,1);
        // Act
        boolean aktueltOutput = test.givDosis(givenDate);
        //Assert
        boolean forventetSvar = true;
        assertSame(forventetSvar, aktueltOutput);
    }

    @Test
    void givDosisTC2() {
        //Arrange
        Patient subject = new Patient("111111-1111", "Anders And", 80.00);
        PN test = new PN(LocalDate.of(23, 2,1), LocalDate.of(23,2,10), 1.00, subject);
        LocalDate givenDate = LocalDate.of(23,2,7);
        // Act
        boolean aktueltOutput = test.givDosis(givenDate);
        //Assert
        boolean forventetSvar = true;
        assertSame(forventetSvar, aktueltOutput);
    }

    @Test
    void givDosisTC3() {
        //Arrange
        Patient subject = new Patient("111111-1111", "Anders And", 80.00);
        PN test = new PN(LocalDate.of(23, 2,1), LocalDate.of(23,2,10), 1.00, subject);
        LocalDate givenDate = LocalDate.of(23,2,10);
        // Act
        boolean aktueltOutput = test.givDosis(givenDate);
        //Assert
        boolean forventetSvar = true;
        assertSame(forventetSvar, aktueltOutput);
    }

    @Test
    void givDosisTC4() {
        //Arrange
        Patient subject = new Patient("111111-1111", "Anders And", 80.00);
        PN test = new PN(LocalDate.of(23, 2,1), LocalDate.of(23,2,10), 1.00, subject);
        LocalDate givenDate = LocalDate.of(23,2,11);
        // Act
        boolean aktueltOutput = test.givDosis(givenDate);
        //Assert
        boolean forventetSvar = false;
        assertSame(forventetSvar, aktueltOutput);
    }

    @Test
    void givDosisTC5() {
        //Arrange
        Patient subject = new Patient("111111-1111", "Anders And", 80.00);
        PN test = new PN(LocalDate.of(23, 1,17), LocalDate.of(23,2,10), 1.00, subject);
        LocalDate givenDate = LocalDate.of(23,1,32);
        // Act
        boolean aktueltOutput = test.givDosis(givenDate);
        //Assert
        boolean forventetSvar = false; //error
        assertSame(forventetSvar, aktueltOutput);
    }

    @Test
    void givDosisTC6() {
        //Arrange
        Patient subject = new Patient("111111-1111", "Anders And", 80.00);
        PN test = new PN(LocalDate.of(23, 2,1), LocalDate.of(23,2,10), 1.00, subject);
        LocalDate givenDate = null;
        // Act
        boolean aktueltOutput = test.givDosis(givenDate);
        //Assert
        boolean forventetSvar = false; //error
        assertSame(forventetSvar, aktueltOutput);
    }

}