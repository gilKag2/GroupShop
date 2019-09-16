package gilKag.groupshop;

import java.util.ArrayList;
import java.util.Arrays;

public class FoodBox {
    private static ArrayList<String> mItems;

    public FoodBox(ArrayList<String> items) {
        mItems = items;
    }

    public FoodBox(String[] items) {
        mItems = new ArrayList<String>(Arrays.asList(items));
    }

    public FoodBox() {
        mItems = new ArrayList<>();
    }

    public void addItem(String item){
        mItems.add(item);
    }

    public void removeItem(String item) {
        mItems.remove(item);
    }

    public static ArrayList<String> getItems() {
        return mItems;
    }

}
