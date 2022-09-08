package Unit0Day4HW;

public class Animal {

    private String name;
    private int age;
    private String breed;

    public Animal(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    //methods
    public String greeting(){
        return "Hi! My name is " + name + ". I am a " + breed + ".";
    }

    public String age(){
        return "I am " + age + " years old.";
    }

    public String toString() {
        return "I am a " + age + " year old " + breed + " and my name is " + name;
    }

    public boolean equals(Animal otherAnimal) {
        return this.name == otherAnimal.name && this.breed == otherAnimal.breed && this.age == otherAnimal.age;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setBreed(String breed){
        this.breed = breed;
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