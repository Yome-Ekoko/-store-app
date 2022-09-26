package convenienceStore;

import enums.Departments;
import enums.Gender;
import enums.ProductType;
import enums.Role;
import product.Products;
import services.CashierService;
import services.CustomerSer;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Products chicken = new Products("Broiler","123meat",2_500.00,2, ProductType.PERISHABLE_FOOD);
        CustomerSer cust1 =new CustomerSer("Mark", Gender.MALE,"mark2gmail.com",23,7000.00,chicken);
        Receipt receipt = new Receipt(345,cust1);
        CashierService cashier = new CashierService(234,Departments.ACCOUNTING,Role.CASHIER,receipt);
        cashier.setName("joy ani");


//        System.out.println(cashier.dispenseReceipt(cashier, cust1));
        System.out.println(receipt.getReceiptSlip());;

    }
}
