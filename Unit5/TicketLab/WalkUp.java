package Unit5.TicketLab;

public class WalkUp extends Ticket {
    private int serialNumber;

    public WalkUp() {
        super();
        serialNumber = super.getSerialNumber();
    }

    public double getPrice() {
        return 50.0;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String toString() {
        return super.toString();
    }
}
