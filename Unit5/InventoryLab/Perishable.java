package Unit5.InventoryLab;

import java.util.Date;

public class Perishable extends InventoryItem // complete this class
{
    private Date expiration;

    public Perishable(Date entry, double price, Date exp) {
        super(entry, price);
        expiration = exp;
    }

    public double getPrice() {
        return super.getBasePrice() * (1 - ((expiration.getTime() < super.getEntry().getTime()) ? 0.9 : 0));
    }

    public String toString() {
        return "Perishable\t" + super.toString() + "\tExpiration Date: " + expiration + "\tActual Price: " + getPrice();
    }
}
