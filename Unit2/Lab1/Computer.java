package Unit2.Lab1;

public class Computer {
    private String choice;

    public Computer() {
        this.choice = GameManager.randomChoice();
    }

    public String toString() {
        return "The Computer chose " + choice;
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
