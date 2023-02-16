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
        PN test = new PN(LocalDate.of(1, 2,23), LocalDate.of(12,2,23), 1.00, subject);
        LocalDate givenDate = LocalDate.of(2,2,23);
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
        PN test = new PN(LocalDate.of(1, 2,23), LocalDate.of(12,2,23), 1.00, subject);
        LocalDate givenDate = LocalDate.of(2,2,23);
        // Act
        boolean aktueltOutput = test.givDosis(givenDate);
        //Assert
        boolean forventetSvar = true;
        assertSame(forventetSvar, aktueltOutput);
    }


    @Test
    void doegnDosis() {
        //Arrange

        // Act

        //Assert


    }

    @Test
    void samletDosis() {
        //Arrange

        // Act

        //Assert


    }
}