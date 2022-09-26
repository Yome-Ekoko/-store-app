package interfaces;

import convenienceStore.CashierApplicant;
//import services.CashierService;
import convenienceStore.Staff;
import services.CustomerSer;

public interface Cashier {
    public String sellProduct(CustomerSer customerSer);
    public String dispensesReceipt();

}
