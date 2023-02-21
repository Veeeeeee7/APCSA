package Unit5.InventoryLab;

import java.util.Date;

public abstract class InventoryItem {
    // instance variables
    protected int id;
    protected Date entry;
    protected double basePrice;

    // constructor
    public InventoryItem(Date entryDate, double price) {
        id = makeID();
        entry = entryDate;
        basePrice = price;
    }

    // setters and getters
    public Date getEntry() {
        return entry;
    }

    public double getBasePrice() {
        return basePrice;
    }

    // other methods
    public abstract double getPrice();

    public static int makeID() // complete this method
    {
        // returns a random int from 235 to 987;
        return (int) (Math.random() * 753 + 235);
    }

    public String toString() // complete this method
    {
        // return a reasonable string;
        return "ID: " + id + "\tEntry Date: " + entry + "\tBase Price: " + basePrice;
    }
}
