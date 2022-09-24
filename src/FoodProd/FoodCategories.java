package FoodProd;

import convenienceStore.Products;
import enums.ProductType;
import FoodProd.TypeOfFood;


public class FoodCategories extends Products {
    private TypeOfFood foodType;



    public FoodCategories() {
    }

    public FoodCategories(TypeOfFood foodType) {
        this.foodType = foodType;
    }

    public FoodCategories(String productName, String productId, Double price, Integer quantity,
                          ProductType typeOfProduct, TypeOfFood foodType) {
        super(productName, productId, price, quantity, typeOfProduct);
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "FoodCategories{" +
                "foodType=" + foodType +
                "} " + super.toString();
    }
}
