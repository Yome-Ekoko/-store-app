package models;

import services.Customer;

import java.time.LocalDateTime;

public class Receipt {

    private  Integer receiptNum;
    private Customer customer;
    private String receiptSlip;

    public Receipt() {
    }

    public Receipt(Integer receiptNum, Customer customer) {
        this.receiptNum = receiptNum;
        this.customer = customer;


    }

    public Integer getReceiptNum() {
        return receiptNum;
    }

    public void setReceiptNum(Integer receiptNum) {
        this.receiptNum = receiptNum;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



    public void setReceiptSlip(String receiptSlip) {
        this.receiptSlip = receiptSlip;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "receiptNum=" + receiptNum +
                ", customer=" + customer +
                ", receiptSlip='" + receiptSlip + '\'' +
                '}';
    }

    public String getReceiptSlip() {
        LocalDateTime dateAndTime = LocalDateTime.now();
        if (customer.buyProduct().equals("product purchased") || customer.buyProduct().equals("product purchased, you have a balance of "+
                (customer.getAmountPaid() - customer.getProductBought().getAmount()) + " in your wallet") ) {
            return "RECEIPT \n" + "Date: " + dateAndTime + "\nreceipt Number: " + receiptNum + "\n"
                    + customer.getProductBought().getProductName() + "Product Quantity: " + customer.getProductBought().getQuantity() +
                    " Rate: " + customer.getProductBought().getPrice() + " Total: " + customer.getProductBought().getAmount() +
                    "\n Balance " +(customer.getAmountPaid()-customer.getProductBought().getAmount()) + "\n THANKS FOR YOUR PATRONAGE!";
        } else {
            return "Transaction incomplete";
        }



    }


}


