package services;

import models.CashierApplicant;
import models.Staff;
import enums.Departments;
import enums.Gender;
import enums.Qualification;
import enums.Role;
import interfaces.ManagerService;

public class Manager extends Staff implements ManagerService {

    public Manager() {
    }

    public Manager(Integer id, Departments department, Role role) {
        super(id, department, role);
    }

    public Manager(String name, Gender gender, String email, Integer age, Integer id, Departments department, Role role) {
        super(name, gender, email, age, id, department, role);
    }

    @Override
    public String hireACashier(Staff staff, CashierApplicant cashierApplicant) {

        if((staff.getRole().equals(Role.MANAGER)&&(cashierApplicant.getQualification().equals(Qualification.OND)||
                cashierApplicant.getQualification().equals(Qualification.WAEC)) && cashierApplicant.getAge()>=18)){
            return "Congratulations, You are hired";
        }
        else{

            return "Sorry you have been disqualified";
        }

    }

}
