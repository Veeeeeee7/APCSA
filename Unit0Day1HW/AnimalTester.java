package Unit0Day1HW;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal = new Animal("Shadow", 4, "German Shepherd");
        System.out.println(animal.getDescription());
        System.out.println(animal.getAge());
    }
}
