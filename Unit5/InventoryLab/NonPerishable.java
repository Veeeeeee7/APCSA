package Unit5.InventoryLab;

import java.util.Date;

public class NonPerishable extends InventoryItem {

    // constructor
    public NonPerishable(Date entry, double price) {
        super(entry, price);
    }

    // other methods
    public double getPrice() {
        return super.getBasePrice();
    }

    public String toString() // complete this method
    {
        // return a reasonable string;
        return "Non Perishable\t" + super.toString() + "\tActual Price: " + getPrice();
    }
}
