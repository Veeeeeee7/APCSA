package Unit3.Day3;

public class Pig implements Animal, FarmAnimal {

    private String name;

    public Pig(String name) {
        this.name = name;
    }

    // implemented methods
    public void makeSound() {
        System.out.println("Oink Oink!");
    }

    public void sleep() {
        // String.format()

        System.out.printf("Goodnight %1$s!\n", this.name);
    }

    public void potty() {
        // String.format()
        System.out.printf("%1$s went potty...erm perhaps we should give them some privacy!\n", this.name);
    }

    public void eat(Object object) {
        // String.format()
        System.out.printf("%1$s ate!\nEat up!", this.name);
    }

    public void butcher() {
        System.out.printf("Sorry %1$s, thank you for your service!", this.name);
    }
}
