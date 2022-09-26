package Test;

import enums.Gender;
import enums.Qualification;
import org.junit.Assert;
import org.junit.Test;
import services.CashierApplicant;

import static org.junit.jupiter.api.Assertions.*;

class CashierApplicantTest {

    @org.junit.jupiter.api.Test
    @Test
    public void applyForJob() {
        CashierApplicant applicant = new CashierApplicant("Maustapha", Gender.MALE,"musty.abayomi@gmail.com",25, Qualification.BSC);

        String expected = "Application Successful";
        String actual = applicant.applyForJob();
        assertEquals(expected, actual);

    }
}