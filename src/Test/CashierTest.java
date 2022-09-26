package Test;

import enums.Departments;
import enums.Gender;
import enums.ProductType;
import enums.Role;
import models.Receipt;
import org.junit.jupiter.api.Test;
import product.Products;
import services.Cashier;
import services.Customer;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {

    @Test
    void sellProduct() {

            Products chicken = new Products("Broiler","123meat",2_500.00,2, ProductType.PERISHABLE_FOOD);
            Customer cust1 =new Customer("Mark", Gender.MALE,"mark2gmail.com",23,5000.00,chicken);
        Receipt receipt = new Receipt(1, cust1);
        Cashier cashier = new Cashier(234, Departments.ACCOUNTING, Role.CASHIER,receipt);

            String productSold= "Product sold!";
            String actual=cashier.sellProduct(cust1);
            assertEquals(productSold,actual);
        }
    @Test
    void purchaseIncomplete() {

        Products chicken = new Products("Broiler", "123meat", 2_500.00, 2, ProductType.PERISHABLE_FOOD);
        Customer cust1 = new Customer("Mark", Gender.MALE, "mark2gmail.com", 23, 4000.00, chicken);
        Receipt receipt = new Receipt(1, cust1);
        Cashier cashier = new Cashier(234, Departments.ACCOUNTING, Role.CASHIER, receipt);

        String incompletePurchase = "Purchase incomplete";
        String actual = cashier.sellProduct(cust1);
        assertEquals(incompletePurchase, actual);

    }





        @Test
    void dispensesReceipt() {

            LocalDateTime dateAndTime = LocalDateTime.now();

            Products chicken = new Products("Broiler","123meat",2_500.00,2, ProductType.PERISHABLE_FOOD);
            Customer cust1 =new Customer("Mark", Gender.MALE,"mark2gmail.com",23,7000.00,chicken);
            Receipt receipt = new Receipt(1, cust1);
            Cashier cashier = new Cashier(234, Departments.ACCOUNTING, Role.CASHIER, receipt);


            String expected = "RECEIPT \n" + "Date: " + dateAndTime + "\nreceipt Number: " + receipt.getReceiptNum() + "\n"
                    + cust1.getProductBought().getProductName() + "Product Quantity: " + cust1.getProductBought().getQuantity() +
                    " Rate: " + cust1.getProductBought().getPrice() + " Total: " + cust1.getProductBought().getAmount() +
                    "\n Balance " + (cust1.getAmountPaid() - cust1.getProductBought().getAmount()) + "\n THANKS FOR YOUR PATRONAGE!";

            String actual = cashier.dispensesReceipt();

            assertEquals(expected, actual);
    }
}
