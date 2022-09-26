package services;

import convenienceStore.Receipt;
import convenienceStore.Staff;
import enums.Departments;
import enums.Gender;
import enums.Role;
import interfaces.Cashier;

import java.time.LocalDateTime;


public class CashierService extends Staff implements Cashier {

    public Receipt receipt;

    public CashierService(Receipt receipt) {
        this.receipt = receipt;
    }

    public CashierService(Integer id, Departments department, Role role, Receipt receipt) {
        super(id, department, role);
        this.receipt = receipt;
    }

    public CashierService(String name, Gender gender, String email, Integer age, Integer id, Departments department, Role role, Receipt receipt) {
        super(name, gender, email, age, id, department, role);
        this.receipt = receipt;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    @Override
    public String toString() {
        return "CashierService{" +
                "receipt=" + receipt +
                "} " + super.toString();
    }

    @Override
    public String sellProduct(CustomerSer customerSer) {
        if(customerSer.buyProduct().equals("Bought product")){
            return "Product sold!";
        }else{
            return "Purchase incomplete";
        }
    }

    @Override
    public String dispensesReceipt() {
        return receipt.getReceiptSlip();
    }


}






