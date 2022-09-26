package interfaces;

//import services.CashierService;
import services.Customer;

public interface CashierService {
    public String sellProduct(Customer customerSer);
    public String dispensesReceipt();

}
