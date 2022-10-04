package Unit0.Unit0Day1.Unit0Day1HW;

public class Animal {

    private String name;
    private int age;
    private String breed;

    public Animal(String newName, int newAge, String newBreed){
        name = newName;
        age = newAge;
        breed = newBreed;
    }

    public String getDescription(){
        return "Hi! My name is " + name + ". I am a " + breed + ".";
    }

    public String getAge(){
        return "I am " + age + " years old.";
    }
}
