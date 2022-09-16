package Unit1Lab;
import java.lang.Math;

public class Dog {
    private String name;
    private int age;
    final int legs;
    private int dogID;
    private char dogIDCheck;

    public Dog(String name, int age, int dogID) {
        this.name = name;
        this.age = age;
        this.legs = 4;
        this.dogID = dogID;
    }
    
    //methods
    public String toString() {
        return "This dog's name is " + name + " and it is " + age + " years old.";
    }

    public int convertToHumanYears() {
        if (this.age == 1) {
            return 13;
        }
        else if (this.age < 1 && this.age >= 3){
            return ((this.age - 1)% 3) * (16/3) + 13;
        }
        else {
            return (this.age / 3) % 3 * 16 + (this.age - 1) % 3 * (16/3) + 13;
        }
    }

    public char getDogIDCheck() {
        int count = 0;
        int temp = 1;
        while (temp <= dogID) {
            temp *= 10;
            count++;
        }
        int sum = 0;

        for (int i = 1; i <= count; i++) {
            if (i > 1) {
                sum += (dogID/(Math.pow(10, i-1)))%10;
            }
            else {
                sum += dogID%10;
            }
        }

        return (char)(70+sum);
    }

    public char computeDogIDCheck() {
        return this.dogIDCheck;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDogID(int dogID) {
        this.dogID = dogID;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getDogID() {
        return this.dogID;
    }
}
