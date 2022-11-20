package Unit3.Day1;

public class CrimeLord {
    public String name;
    public boolean arrested;
    public double moneyLaundered;
    public int level;

    public CrimeLord(String name, boolean arrested, double moneyLaundered, int level) {
        this.name = name;
        this.arrested = arrested;
        this.moneyLaundered = moneyLaundered;
        this.level = level;
    }

    public static void main(String[] args) {
        CrimeLord asher = new CrimeLord("Asher", false, 100, 10);
        CrimeLord kyara = new CrimeLord("Kyara", false, 101, 10);
        MafiaBoss jonah = new MafiaBoss("Jonah", false, "Los Angeles", 5);
        asher.snitchOn(jonah);
        System.out.println("Jonah is arrested: " + jonah.arrested);
        asher.snitchOn(asher);
        System.out.println("Asher is arrested: " + asher.arrested);
    }

    public void snitchOn(Object person) {
        if (person.equals(this)) {
            arrested = true;
            System.out.println("I got arrested!");
        }
        if (person instanceof MafiaBoss) {
            MafiaBoss boss = (MafiaBoss) person;
            level += 1;
            moneyLaundered += 100;
            boss.arrested = true;
            System.out.println("The enemy has been defeatd");
        } else {
            level -= 1;
            System.out.println("Why did you betray me?");
        }
    }
}
