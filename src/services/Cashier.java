package services;

import models.Receipt;
import models.Staff;
import enums.Departments;
import enums.Gender;
import enums.Role;
import interfaces.CashierService;


public class Cashier extends Staff implements CashierService {

    public Receipt receipt;

    public Cashier(Receipt receipt) {
        this.receipt = receipt;
    }

    public Cashier(Integer id, Departments department, Role role, Receipt receipt) {
        super(id, department, role);
        this.receipt = receipt;
    }

    public Cashier(String name, Gender gender, String email, Integer age, Integer id, Departments department, Role role, Receipt receipt) {
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
    public String sellProduct(Customer customer) {
        if(customer.buyProduct().equals("product purchased")){
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






