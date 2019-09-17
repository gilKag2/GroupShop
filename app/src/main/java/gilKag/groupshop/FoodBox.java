package gilKag.groupshop;

import java.util.ArrayList;
import java.util.Arrays;

public class FoodBox {
    private static ArrayList<Product> mProducts;


    FoodBox(ArrayList<Product> products) {
        mProducts = products;
    }

    public static ArrayList<Product> getProducts() {
        return mProducts;
    }

    public static void setProducts(ArrayList<Product> mProducts) {
        FoodBox.mProducts = mProducts;
    }

    public static void removeProduct(Product product){
        mProducts.remove(product);
    }

    public static void addProduct(Product product) {
        mProducts.add(product);
    }
}
