package services;

import convenienceStore.Person;
import convenienceStore.Products;
import enums.Gender;
import enums.ProductType;
import interfaces.CustomerInt;

public class Customer extends Products implements CustomerInt {
    private String custName;
    private String custId;
    private Double amountPaid;
    public Customer() {
    }

    public Customer(String custName, String custId, Double amountPaid) {
        this.custName = custName;
        this.custId = custId;
        this.amountPaid = amountPaid;
    }

    public Customer(String productName, String productId, Double price, Integer quantity, ProductType typeOfProduct, String custName, String custId, Double amountPaid) {
        super(productName, productId, price, quantity, typeOfProduct);
        this.custName = custName;
        this.custId = custId;
        this.amountPaid = amountPaid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custName='" + custName + '\'' +
                ", custId='" + custId + '\'' +
                "} " + super.toString();
    }


    @Override
    public String buyProduct() {
        if (getAmountPaid().equals(getAmount())|| getAmountPaid()>getAmount()) {
            return "Bought a product";
        }
        else{
            return "purchase incomplete";
        }
    }
    public String getBalance(){
        if(getAmount()>(amountPaid)){
            return "Payment incomplete";
        } else if (getAmountPaid()>getAmount()) {
            return "product purchased, you have a balance in your wallet";
        }else {
            return "product purchased";
        }
    }



        }



