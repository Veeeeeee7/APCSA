package Unit2.Unit2Day4;

public class Pokemon {
    private String name;
    private String type;
    private int health;
    private int attack;

    public Pokemon(String name, String tupe, int health, int attack) {
        this.name = name;
        this.type = tupe;
        this.health = health;
        this.attack = attack;
    }

    public String toString() {
        return "Name - [" + name + " Type: " + type + " Health: " + health + " Attack: " + attack + "]";
    }
}
