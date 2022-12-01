package Unit3.Day3;

public class Cow implements Animal, FarmAnimal {

    private String name;
    private boolean butchered;

    public Cow(String name) {
        this.name = name;
        butchered = false;
    }

    // getters

    public String getName() {
        return name;
    }

    // implemented methods
    public void makeSound() {
        System.out.println("MoooOoOOOo!");
    }

    public void sleep() {
        // String.format()

        System.out.printf("Goodnight %1$s! Don't jump over the moon!\n", this.name);
    }

    public void potty() {
        // String.format()
        System.out.printf("%1$s went potty...awkward, someone needs to clean that up! Not me though...\n", this.name);
    }

    public void eat(Object object) {
        // String.format()
        if (object instanceof Food) {
            Food food = (Food) object;
            System.out.printf("%1$s ate!\nMunch Munch!", this.name);
        } else {
            System.out.printf("%1$s attempted to eat!\nIt failed!\n", this.name);
        }

    }

    public void butcher() {
        butchered = true;
        System.out.printf("%1$s thank you for your service!", this.name);
    }
}

// TO-DO: Create a Food class for the cows and pigs to eat.
// TO-DO: In the eat method, check if it's a Food object and cast it to a Food
// variable
// TO-DO: Create a new interface specifically for Cat