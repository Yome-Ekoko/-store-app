package Test;

import enums.Gender;
import enums.ProductType;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import product.Products;
import services.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void PurchaseIncomplete() {

        Products chicken = new Products("Broiler","123meat",2_500.00,2, ProductType.PERISHABLE_FOOD);
        Customer cust1 =new Customer("Mark", Gender.MALE,"mark2gmail.com",23,4000.00,chicken);

        String purchaseIncomplete ="Payment incomplete! \nYou need to add a balance of " + (chicken.getAmount() - cust1.getAmountPaid()) + " to complete this transaction!!" ;
        String actual= cust1.buyProduct();
        assertEquals(purchaseIncomplete,actual);

    } @Test
    void productPurchased() {
        Products chicken = new Products("Broiler","123meat",2_500.00,2, ProductType.PERISHABLE_FOOD);
        Customer cust1 =new Customer("Mark", Gender.MALE,"mark2gmail.com",23,5000.00,chicken);

        String productPurchased="product purchased";
        String actual=cust1.buyProduct();
        assertEquals(productPurchased,actual);

    } @Test
    void balance() {
        Products chicken = new Products("Broiler","123meat",2_500.00,2, ProductType.PERISHABLE_FOOD);
        Customer cust1 =new Customer("Mark", Gender.MALE,"mark2gmail.com",23,7000.00,chicken);

        String balance = "product purchased, you have a balance of "+ (cust1.getAmountPaid() - chicken.getAmount()) + " in your wallet";
        String actual = cust1.buyProduct();
        assertEquals(balance,actual);
    }
}

