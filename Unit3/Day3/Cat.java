package Unit3.Day3;

public class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    // implemented methods
    public void makeSound() {
        System.out.println("Meoooow!");
    }

    public void sleep() {
        // String.format()

        System.out.printf("%1$s went to sleep! How cute!\n", this.name);
    }

    public void potty() {
        // String.format()
        System.out.printf("%1$s went potty...there's litter everywhere!\n", this.name);
    }

    public void eat(Object object) {
        // String.format()

        if (object instanceof Cow) {
            Cow cow = (Cow) object;
            System.out.printf("%1$s attempted to eat %2$s!\n", this.name, cow.getName());
            System.out.println("They got kicked in the face!");
        }

    }

}
