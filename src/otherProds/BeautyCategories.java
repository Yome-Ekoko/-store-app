package otherProds;


import convenienceStore.Products;
import enums.ProductType;
import otherProds.TypeOfBeautyProduct;

public class BeautyCategories extends Products {
    private Integer serialNumber;
   private TypeOfBeautyProduct beautyType;

    public BeautyCategories() {
    }

    public BeautyCategories(Integer serialNumber, TypeOfBeautyProduct beautyType) {
        this.serialNumber = serialNumber;
        this.beautyType = beautyType;
    }

    public BeautyCategories(String productName, String productId, Double price, Integer quantity, ProductType typeOfProduct,
                            Integer serialNumber, TypeOfBeautyProduct beautyType) {
        super(productName, productId, price, quantity, typeOfProduct);
        this.serialNumber = serialNumber;
        this.beautyType = beautyType;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public TypeOfBeautyProduct getBeautyType() {
        return beautyType;
    }

    public void setBeautyType(TypeOfBeautyProduct beautyType) {
        this.beautyType = beautyType;
    }

    @Override
    public String toString() {
        return "BeautyCategories{" +
                "serialNumber=" + serialNumber +
                ", beautyType=" + beautyType +
                "} " + super.toString();
    }
}
