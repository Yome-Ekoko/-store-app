package models;

import enums.*;
import product.Products;
import services.Cashier;
import services.CashierApplicant;
import services.Customer;
import services.Manager;

public class Main {
    public static void main(String[] args) {
        Products chicken = new Products("Broiler","123meat",2_500.00,2, ProductType.PERISHABLE_FOOD);
        Customer cust1 =new Customer("Mark", Gender.MALE,"mark2gmail.com",23,7000.00,chicken);
        Receipt receipt = new Receipt(1, cust1);
        Cashier cashier = new Cashier(234,Departments.ACCOUNTING,Role.CASHIER,receipt);
        cashier.setName("joy ani");


//        System.out.println(cashier.dispenseReceipt(cashier, cust1));
        System.out.println(receipt.getReceiptSlip());
        System.out.println(receipt.getReceiptSlip());

        CashierApplicant applicant = new CashierApplicant("Maustapha",Gender.MALE,"musty.abayomi@gmail.com",25, Qualification.BSC);
        Manager manager = new Manager("Yome",Gender.FEMALE,"", 35,123,Departments.MANAGEMENT,Role.CASHIER);
        Manager manager2 = new Manager("Yome",Gender.FEMALE,"", 35,123,Departments.MANAGEMENT,Role.MANAGER);
        System.out.println(manager.hireACashier(manager,applicant));
        System.out.println(applicant.applyForJob());


    }

}
