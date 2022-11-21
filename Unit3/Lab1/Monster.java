package Unit3.Lab1;

import static java.lang.System.*;

public class Monster {
    private int myWeight;
    private int myHeight;
    private int myAge;

    // write an initialization constructor with int parameters ht, wt, and age
    public Monster(int ht, int wt, int age) {
        myHeight = ht;
        myWeight = wt;
        myAge = age;
    }

    // write a no parameter constructor
    public Monster() {
        this(0);
    }

    // write an initialization constructor with an int parameter ht
    public Monster(int ht) {
        this(ht, 0);
    }

    // write an initialization constructor with int parameters ht and wt
    public Monster(int ht, int wt) {
        this(ht, wt, 0);
    }

    // modifiers - write set methods for height, weight, and age
    public void setHeight(int ht) {
        myHeight = ht;
    }

    public void setWeight(int wt) {
        myWeight = wt;
    }

    public void setAge(int age) {
        myAge = age;
    }

    // accessors - write get methods for height, weight, and age
    public int getHeight() {
        return myHeight;
    }

    public int getWeight() {
        return myWeight;
    }

    public int getAge() {
        return myAge;
    }

    // creates a new copy of this Object
    public Monster clone() {
        return new Monster(this.myHeight, this.myWeight, this.myAge);
    }

    public boolean equals(Monster other) {
        return myHeight == other.getHeight() && myWeight == other.getWeight() && myAge == other.getAge();
    }

    public int compareTo(Monster other) {
        if (myHeight > other.getHeight()) {
            return 1;
        } else if (myHeight < other.getHeight()) {
            return -1;
        }
        if (myWeight > other.getWeight()) {
            return 1;
        } else if (myWeight < other.getWeight()) {
            return -1;
        }
        if (myAge > other.getAge()) {
            return 1;
        } else if (myAge < other.getAge()) {
            return -1;
        }
        return 0;
    }

    public String toString() {
        return "Ht - " + myHeight + " Wt - " + myWeight + " Age - " + myAge;
    }

}
