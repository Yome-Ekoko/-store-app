package Test;

import enums.Gender;
import enums.ProductType;
import models.Receipt;
import org.junit.jupiter.api.Test;
import product.Products;
import services.Customer;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptTest {

    @Test
    void getReceiptSlip() {
        LocalDateTime dateAndTime = LocalDateTime.now();

        Products chicken = new Products("Broiler","123meat",2_500.00,2, ProductType.PERISHABLE_FOOD);
        Customer cust1 =new Customer("Mark", Gender.MALE,"mark2gmail.com",23,7000.00,chicken);
        Receipt receipt = new Receipt(1, cust1);

        String expected = "RECEIPT \n" + "Date: " + dateAndTime + "\nreceipt Number: " + receipt.getReceiptNum() + "\n"
                + cust1.getProductBought().getProductName() + "Product Quantity: " + cust1.getProductBought().getQuantity() +
                " Rate: " + cust1.getProductBought().getPrice() + " Total: " + cust1.getProductBought().getAmount() +
                "\n Balance " + (cust1.getAmountPaid() - cust1.getProductBought().getAmount()) + "\n THANKS FOR YOUR PATRONAGE!";

        String actual = receipt.getReceiptSlip();

        assertEquals(expected, actual);


    }

    @Test
    void getReceiptSlipFailed() {
        LocalDateTime dateAndTime = LocalDateTime.now();

        Products chicken = new Products("Broiler","123meat",2_500.00,2, ProductType.PERISHABLE_FOOD);
        Customer cust1 =new Customer("Mark", Gender.MALE,"mark2gmail.com",23,2000.00,chicken);
        Receipt receipt = new Receipt(1, cust1);

        String expected = "Transaction incomplete";

        String actual = receipt.getReceiptSlip();

        assertEquals(expected, actual);


    }



}