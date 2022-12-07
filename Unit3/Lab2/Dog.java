package Unit3.Lab2;

// write the header for the dog class
// this class uses the petable interface
public class Dog implements Petable {
    private int tailWag;
    private String myName;
    private static int totalDogMisBehaveCount;

    // write two constructors, a no parameter and one that takes 2 parameters
    // you must use the this keyword
    public Dog() {
        this("Druppy", 0);
    }

    public Dog(String myName, int tailWag) {
        this.myName = myName;
        this.tailWag = tailWag;
    }

    // write the methods required in the interface
    // a) if one brushes the dog's hair, the tailWag counter is incremented
    // b) if the dog bites a cat, totalDogMisBehaveCount is incremented and the
    // cat's IsPurring variable is set to false
    // note: you will need to look up the instanceof operator.
    public void brushHair() {
        tailWag++;
    }

    public void bite(Object o) {
        if (o instanceof Cat) {
            totalDogMisBehaveCount++;
            ((Cat) o).setIsPurring(false);
        }
    }

    // write appropriate setters and getters
    public int getTailWag() {
        return tailWag;
    }

    public void setTailWag(int tailWag) {
        this.tailWag = tailWag;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public static int getTotalDogMisBehaveCount() {
        return totalDogMisBehaveCount;
    }

    // write a toString() method
    public String toString() {
        return "Dog [tailWag=" + tailWag + ", myName=" + myName + "]";
    }
}
