package Unit5.Day1;

public class ConnoisseurZombie extends Zombie {
    private String name;

    public ConnoisseurZombie(String name, boolean isUndead) {
        super(isUndead);
        this.name = name;
    }

    public String judge() {
        return "I'm gay and I'm feeling okay.";
    }

}
