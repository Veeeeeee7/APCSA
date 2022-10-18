package Unit2.Lab1;

public class Player {
    private String name;
    private String choice;

    public String toString() {
        return name + " chose " + choice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
            this.choice = choice;
        } else {
            this.choice = GameManager.randomChoice();
        }
    }
}
