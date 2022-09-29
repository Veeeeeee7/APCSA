package Unit1DogLab;

public class Dog {
    private String name;
    private int age;
    final int legs;
    private int dogID;
    private char dogIDCheck;
    private String dogTag;

    public Dog(String name, int age, int dogID, String dogTag) {
        this.name = name;
        this.age = age;
        this.legs = 4;
        this.dogID = dogID;
        this.dogTag = dogTag;
        this.dogIDCheck = DogHelper.computeDogIDCheck(dogID);
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

    public String createDogTag() {
        this.dogTag = Integer.toString(this.dogID) + dogIDCheck;
        return this.dogTag;
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

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
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

    public String getDogTag() {
        return this.dogTag;
    }
}
