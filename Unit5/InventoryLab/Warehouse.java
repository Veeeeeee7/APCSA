package Unit5.InventoryLab;

import java.util.ArrayList;

public class Warehouse {
    // instance variables
    private ArrayList<InventoryItem> items;

    // write the constructor
    public Warehouse(ArrayList<InventoryItem> items) {
        this.items = items;
    }

    public ArrayList<InventoryItem> getItems(double lo, double hi) // complete this method
    {
        // returns an ArrayList of all items whose price is between
        // lo and hi inclusive
        ArrayList<InventoryItem> result = new ArrayList<InventoryItem>();
        for (InventoryItem item : items) {
            if (item.getPrice() >= lo && item.getPrice() <= hi) {
                result.add(item);
            }
        }
        return result;
    }

    public String toString() {
        return items.toString();
    }
}
