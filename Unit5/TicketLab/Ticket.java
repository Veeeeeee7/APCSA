package Unit5.TicketLab;

public abstract class Ticket {
    // instance variables
    private int serialNumber;

    // constructor
    public Ticket() {
        serialNumber = getNextSerialNumber();
    }

    // setters and getters
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    // other methods
    public abstract double getPrice();

    public String toString() {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    private static int getNextSerialNumber() {
        return (int) (Math.random() * 1000);
    }
}