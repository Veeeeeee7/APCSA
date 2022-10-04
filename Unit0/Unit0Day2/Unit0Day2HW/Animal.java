package Unit0.Unit0Day2.Unit0Day2HW;

public class Animal {

    private String name;
    private int age;
    private String breed;

    public Animal(String newName, int newAge, String newBreed){
        name = newName;
        age = newAge;
        breed = newBreed;
    }

    //methods
    public String description(){
        return "Hi! My name is " + name + ". I am a " + breed + ".";
    }

    public String age(){
        return "I am " + age + " years old.";
    }

    //setters
    public void setName(String newName){
        name = newName;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setBreed(String newBreed){
        breed = newBreed;
    }

    //getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getBreed(){
        return breed;
    }
}
