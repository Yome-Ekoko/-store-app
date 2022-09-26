package services;

import convenienceStore.CashierApplicant;
import convenienceStore.Staff;
import enums.Departments;
import enums.Gender;
import enums.Qualification;
import enums.Role;
import interfaces.Manager;

public class ManagerService extends Staff implements Manager {

    public ManagerService() {
    }

    public ManagerService(Integer id, Departments department, Role role) {
        super(id, department, role);
    }

    public ManagerService(String name, Gender gender, String email, Integer age, Integer id, Departments department, Role role) {
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
