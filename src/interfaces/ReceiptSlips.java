package interfaces;

import services.CashierService;
import services.CustomerSer;

public interface ReceiptSlips {
    public String getReceiptSlips(CashierService cashier, CustomerSer customer);

}
