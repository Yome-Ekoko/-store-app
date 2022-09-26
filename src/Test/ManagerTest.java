package Test;

import enums.Departments;
import enums.Gender;
import enums.Qualification;
import enums.Role;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import services.CashierApplicant;
import services.Manager;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {



    @Test
    void cashierIsHired() {
//        CashierApplicant applicant = new CashierApplicant("Maustapha", Gender.MALE,"musty.abayomi@gmail.com",25, Qualification.BSC);
        CashierApplicant applicant = new CashierApplicant("Maustapha", Gender.MALE,"musty.abayomi@gmail.com",25, Qualification.OND);
//        Manager manager = new Manager("Yome",Gender.FEMALE,"", 35,123, Departments.MANAGEMENT, Role.CASHIER);
        Manager manager2 = new Manager("Yome",Gender.FEMALE,"", 35,123,Departments.MANAGEMENT,Role.MANAGER);

        String cashierHired = "Congratulations, You are hired";
        String actual = manager2.hireACashier(manager2,applicant);
        Assert.assertEquals(cashierHired,actual);

    }

    @Test
    void cashierNotHired() {
        CashierApplicant applicant = new CashierApplicant("Maustapha", Gender.MALE,"musty.abayomi@gmail.com",25, Qualification.BSC);
//        CashierApplicant applicant = new CashierApplicant("Maustapha", Gender.MALE,"musty.abayomi@gmail.com",25, Qualification.OND);
//       Manager manager = new Manager("Yome",Gender.FEMALE,"", 35,123, Departments.MANAGEMENT, Role.CASHIER);
        Manager manager2 = new Manager("Yome",Gender.FEMALE,"", 35,123,Departments.MANAGEMENT,Role.MANAGER);

        String cashierNotHired = "Sorry you have been disqualified";
        String actual = manager2.hireACashier(manager2,applicant);
        Assert.assertEquals(cashierNotHired,actual);

    }
    @Test
    void accessDenied() {
//        CashierApplicant applicant = new CashierApplicant("Maustapha", Gender.MALE,"musty.abayomi@gmail.com",25, Qualification.BSC);
      CashierApplicant applicant = new CashierApplicant("Maustapha", Gender.MALE,"musty.abayomi@gmail.com",25, Qualification.OND);
       Manager manager = new Manager("Yome",Gender.FEMALE,"", 35,123, Departments.MANAGEMENT, Role.CASHIER);
//        Manager manager2 = new Manager("Yome",Gender.FEMALE,"", 35,123,Departments.MANAGEMENT,Role.MANAGER);

        String accessDenied = " Access Denied!!";
        String actual = manager.hireACashier(manager,applicant);
        Assert.assertEquals(accessDenied,actual);

    }

}