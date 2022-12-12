package Unit3.Day3;

public class FarmTester {
    public static void main(String[] args) {

        // Cat cat = new Cat("Rancho Cucamonga");
        // Cow cow = new Cow("Betsy");
        // Pig pig = new Pig("Babe");

        // Food food = new Food("Grass");
        // cat.makeSound();
        // cat.potty();
        // cat.sleep();

        // cow.makeSound();
        // cow.potty();
        // cow.sleep();

        // pig.makeSound();
        // pig.potty();
        // pig.sleep();

        // cat.eat(cow);
        // cow.eat(food);
        // // pig.eat(food);

        // Animal[] a = { new Cat("GOD DAMN"), new Cow("Betsy"), new Pig("Babe") };
        // System.out.println(((Cat) a[0]).getName());

        Animal[] cat = { new Cat("a"), new Cat("b"), new Cat("c") };
        for (Animal c : cat)
            System.out.println(((Cat) c).getName());
    }
}
