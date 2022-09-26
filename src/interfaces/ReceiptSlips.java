package interfaces;

import services.Cashier;
import services.Customer;

public interface ReceiptSlips {
    public String getReceiptSlips(Cashier cashier, Customer customer);

}
