package Unit1Lab;

public class DogTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob", 1, 123);
        System.out.println("The dog's age (" + dog.getAge() + ") in human years: " + dog.convertToHumanYears());
        dog.setAge(2);
        System.out.println("The dog's age (" + dog.getAge() + ") in human years: " + dog.convertToHumanYears());
        dog.setAge(4);
        System.out.println("The dog's age (" + dog.getAge() + ") in human years: " + dog.convertToHumanYears());

    }
}
