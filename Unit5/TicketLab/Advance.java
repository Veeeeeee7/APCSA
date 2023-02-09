package Unit5.TicketLab;

public class Advance extends Ticket {
    private int serialNumber;
    private int daysInAdvance;

    public Advance(int daysInAdvance) {
        super();
        serialNumber = super.getSerialNumber();
        this.daysInAdvance = daysInAdvance;
    }

    public double getPrice() {
        if (daysInAdvance >= 10) {
            return 30.0;
        } else {
            return 40.0;
        }
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String toString() {
        return super.toString();
    }
}
