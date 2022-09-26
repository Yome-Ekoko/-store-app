package services;

import convenienceStore.Person;
import enums.Gender;
import interfaces.Customer;
import product.Products;
import enums.ProductType;

public class CustomerSer extends Person implements Customer {

    private Double amountPaid;
    private Products productBought;

    public CustomerSer() {
    }

    public CustomerSer(Double amountPaid, Products productBought) {
        this.amountPaid = amountPaid;
        this.productBought = productBought;
    }

    public CustomerSer(String name, Gender gender, String email, Integer age, Double amountPaid, Products productBought) {
        super(name, gender, email, age);
        this.amountPaid = amountPaid;
        this.productBought = productBought;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Products getProductBought() {
        return productBought;
    }

    public void setProductBought(Products productBought) {
        this.productBought = productBought;
    }

    @Override
    public String toString() {
        return "CustomerSer{" +
                "amountPaid=" + amountPaid +
                ", productBought=" + productBought +
                "} " + super.toString();
    }

    @Override
    public String buyProduct() {
        if(productBought.getAmount()>(amountPaid)){
            return "Payment incomplete! \nYou need to add a balance of " + (productBought.getAmount() - amountPaid) + " to complete this transaction!!" ;
        } else if (getAmountPaid()>productBought.getAmount()) {
            return "product purchased, you have a balance of "+ (getAmountPaid() - productBought.getAmount()) + " in your wallet";
        }else {
            return "product purchased";
        }
    }


    }







