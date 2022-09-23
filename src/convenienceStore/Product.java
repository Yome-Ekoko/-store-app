package convenienceStore;

import enums.TypeOfProducts;

import java.util.ArrayList;

public class Product {
    private String productName;
    private String productId;
    private Double price;
    private Integer quantity;
    private TypeOfProducts typeOfProduct;
//    private Double amount;

    public Product() {
    }

    public Product(String productName, String productId, Double price, Integer quantity, TypeOfProducts typeOfProduct) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.typeOfProduct = typeOfProduct;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public TypeOfProducts getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(TypeOfProducts typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }
//
    public Double getAmount() {
      Double amount =   this.price * this.quantity;
        return amount;
    }
//
//    public void setAmount(Double amount) {
//        this.amount = amount;
//    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", typeOfProduct=" + typeOfProduct +
//                ", amount=" + amount +
                '}';
    }
}
