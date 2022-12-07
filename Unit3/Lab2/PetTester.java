package Unit3.Lab2;

public class PetTester {
    public static void main(String[] args) {
        // create an array of 3 Petables, 1 Cat and 2 Dogs.
        // Use all 3 construcors to instantiate the objects
        Petable[] pets = new Petable[3];
        pets[0] = new Cat("Louis", true);
        pets[1] = new Dog("Bobby McDonalds", 9999);
        pets[2] = new Dog();

        // call the brushHair method for the two Dogs
        pets[1].brushHair();
        pets[2].brushHair();

        // call the getIsPurring method for the Cat
        System.out.println("Is " + ((Cat) pets[0]).getName() + " purring? " + ((Cat) pets[0]).getIsPurring());

        // make at least 5 calls to the bite methods of
        // the Dogs and Cat objects
        pets[0].bite(pets[1]);
        pets[1].bite(pets[0]);
        pets[1].bite(pets[2]);
        pets[1].bite(pets[2]);
        pets[2].bite(pets[0]);

        // after the +, call the appropriate misbehave count getter
        System.out.println("dog bite count: " + Dog.getTotalDogMisBehaveCount());
        System.out.println("cat bite count: " + Cat.getTotalCatMisBehaveCount());

    }
}
