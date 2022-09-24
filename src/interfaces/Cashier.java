package interfaces;

import convenienceStore.CashierApplicant;
import convenienceStore.Products;
//import services.CashierService;
import convenienceStore.Staff;
import services.Customer;

public interface Cashier {
    public String sellProduct(Staff staff, CashierApplicant cashierApplicant);

    public String dispenseReceipt(Staff staff, CashierApplicant cashierApplicant);
}
