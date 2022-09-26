package product;


import enums.ProductType;

public class Products {
    private String productName;
    private String productId;
    private Double price;
    private Integer quantity;
    private ProductType typeOfProduct;

    private Double amount;


    public Products() {
    }

    public Products(String productName, String productId, Double price, Integer quantity, ProductType typeOfProduct) {
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

    public ProductType getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(ProductType typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public Double getAmount() {
      Double amount =   this.price * this.quantity;
        return amount;
    }


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
