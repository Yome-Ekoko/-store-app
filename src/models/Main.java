package models;

import enums.Departments;
import enums.Gender;
import enums.ProductType;
import enums.Role;
import product.Products;
import services.Cashier;
import services.Customer;

public class Main {
    public static void main(String[] args) {
        Products chicken = new Products("Broiler","123meat",2_500.00,2, ProductType.PERISHABLE_FOOD);
        Customer cust1 =new Customer("Mark", Gender.MALE,"mark2gmail.com",23,7000.00,chicken);
        Receipt receipt = new Receipt(345,cust1);
        Cashier cashier = new Cashier(234,Departments.ACCOUNTING,Role.CASHIER,receipt);
        cashier.setName("joy ani");


//        System.out.println(cashier.dispenseReceipt(cashier, cust1));
        System.out.println(receipt.getReceiptSlip());;

    }
}
