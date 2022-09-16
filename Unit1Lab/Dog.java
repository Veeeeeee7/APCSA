package Unit1Lab;

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
        this.dogIDCheck = (char)(dogID%10 + (dogID/10)%10 + (dogID/100)%10 + 70);
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
