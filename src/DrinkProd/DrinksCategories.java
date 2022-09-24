package DrinkProd;

import convenienceStore.Products;
import enums.ProductType;

public class DrinksCategories extends Products {
private TypesOfDrinks drinkType;

    public DrinksCategories() {
    }
    public DrinksCategories(String productName, String productId, Double price, Integer quantity,
                            ProductType typeOfProduct, TypesOfDrinks drinkType) {
        super(productName, productId, price, quantity, typeOfProduct);
        this.drinkType = drinkType;
    }

    public TypesOfDrinks getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(TypesOfDrinks drinkType) {
        this.drinkType = drinkType;
    }

    @Override
    public String toString() {
        return "DrinksCategories{" +
                "drinkType=" + drinkType +
                "} " + super.toString();
    }
}
