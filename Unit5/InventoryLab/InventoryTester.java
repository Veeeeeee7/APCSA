package Unit5.InventoryLab;

import java.util.ArrayList;
import java.util.Date;

public class InventoryTester {
    // write the tester
    // this should instantiate a Warehouse object
    // this object must have at least four items
    // some items should be Perishable
    // some items should be NonPerishable
    // call the getItems method from the Warehouse class
    // you should select the values for lo and hi
    // implement the toString methods you've written

    public static void main(String[] args) {
        ArrayList<InventoryItem> items = new ArrayList<InventoryItem>();
        items.add(new Perishable(new Date(), 100, new Date(124, 1, 1)));
        System.out.println("First Item: " + items.get(0));
        items.add(new Perishable(new Date(), 100, new Date(120, 1, 1)));
        System.out.println("Second Item: " + items.get(1));
        items.add(new NonPerishable(new Date(), 100));
        System.out.println("Third Item: " + items.get(2));
        items.add(new NonPerishable(new Date(), 100));
        System.out.println("Fourth Item: " + items.get(3));
        Warehouse warehouse = new Warehouse(items);
        System.out.println("\nWarehouse: " + warehouse);
        System.out.println("Items in warehouse between 9 to 11 dollars: " + warehouse.getItems(9, 11));
    }
}