package Unit3.Lab2;

// write the header for the Cat class
// this class will use the Petable interface
public class Cat implements Petable {
    private String name;
    private boolean isPurring;
    private static int totalCatMisBehaveCount;

    // write a constructor that takes 2 parameter
    public Cat(String name, boolean isPurring) {
        this.name = name;
        this.isPurring = isPurring;
    }

    // write the methods required in the interface
    // a) if one brushes the cat's hair, isPurring is set to true
    // b) if a cat bites a dog, totalCatMisBehaveCount is incremented and the
    // dog's tailWag variable is set to 0
    // note: you will need to look up the instanceof operator
    public void brushHair() {
        isPurring = true;
    }

    public void bite(Object o) {
        if (o instanceof Dog) {
            totalCatMisBehaveCount++;
            ((Dog) o).setTailWag(0);
        }
    }

    // write appropriate setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsPurring() {
        return isPurring;
    }

    public void setIsPurring(boolean isPurring) {
        this.isPurring = isPurring;
    }

    public static int getTotalCatMisBehaveCount() {
        return totalCatMisBehaveCount;
    }
}
