package convenienceStore;

import enums.TypeOfProducts;

public class Main {
    public static void main(String[] args) {
Product soap= new Product("EVA","12hsg",120_000.00,25,TypeOfProducts.BEAUTY);

        System.out.println(soap);
        System.out.println(soap.getAmount());
    }
}
