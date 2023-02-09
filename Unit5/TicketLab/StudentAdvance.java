package Unit5.TicketLab;

public class StudentAdvance extends Advance {
    private int serialNumber;
    private int daysInAdvance;

    public StudentAdvance(int daysInAdvance) {
        super(daysInAdvance);
        serialNumber = super.getSerialNumber();
        this.daysInAdvance = daysInAdvance;
    }

    public double getPrice() {
        return super.getPrice() / 2;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String toString() {
        return super.toString() + "\n(student ID required)";
    }
}
