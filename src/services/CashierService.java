package services;

import convenienceStore.CashierApplicant;
import convenienceStore.Products;
import convenienceStore.Staff;
import enums.Departments;
import enums.Gender;
import enums.Role;
import interfaces.Cashier;

import java.sql.Time;
import java.util.Date;
import java.util.SplittableRandom;

public class CashierService extends Staff implements Cashier {
    private Date transactionDate;
    private Time transactionTime;
    private String salesStatus;


    public CashierService() {
    }

    public CashierService(Date transactionDate, Time transactionTime, String salesStatus) {
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.salesStatus = salesStatus;
    }

    public CashierService(Integer id, Departments department, Role role, Date transactionDate, Time transactionTime, String salesStatus) {
        super(id, department, role);
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.salesStatus = salesStatus;
    }

    public CashierService(String name, Gender gender, String email, Integer age, Integer id, Departments department, Role role, Date transactionDate, Time transactionTime, String salesStatus) {
        super(name, gender, email, age, id, department, role);
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.salesStatus = salesStatus;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Time getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Time transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getSalesStatus() {
        if()
        return salesStatus;
    }

    public void setSalesStatus(String salesStatus) {
        this.salesStatus = salesStatus;
    }

    @Override
    public String sellProduct(Staff staff, CashierApplicant cashierApplicant) {

        return null;
    }

    @Override
    public String dispenseReceipt(Staff staff, CashierApplicant cashierApplicant) {
        if()
        return null;
    }
}



