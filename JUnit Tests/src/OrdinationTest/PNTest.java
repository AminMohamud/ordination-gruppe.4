package OrdinationTest;

import ordination.Laegemiddel;
import ordination.Ordination;
import ordination.PN;
import ordination.Patient;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PNTest {

    @Test
    void givDosis() {
        //Arrange
        Patient subject = new Patient("111111-1111", "Anders And", 80.00);
        PN test = new PN(LocalDate.of(1, 2,23), LocalDate.of(12,2,23), 1.00, subject);
        LocalDate givenDate = LocalDate.of(2,2,23);
        Laegemiddel middel = new Laegemiddel("Acetylsalicylsyre", 0.1, 0.15, 0.16, "Styk");
        test.setLaegemiddel(middel);
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