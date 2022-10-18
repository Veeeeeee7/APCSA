package Unit2.Lab1;

public class GameManager {
    private Player player;
    private Computer computer;

    public GameManager(Player player, Computer computer) {
        this.player = new Player();
        this.computer = new Computer();
    }

    public void setPlayerInformation(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }

    public boolean didPlayerWin() {
        if (player.getChoice().equals("rock")) {
            if (computer.getChoice().equals("scissors")) {
                return true;
            } else {
                return false;
            }
        } else if (player.getChoice().equals("paper")) {
            if (computer.getChoice().equals("rock")) {
                return true;
            } else {
                return false;
            }
        } else {
            if (computer.getChoice().equals("paper")) {
                return true;
            } else {
                return false;
            }
        }
    }

    public String getPlayer() {
        return player.toString();
    }

    public String getComputer() {
        return computer.toString();
    }

    public static String randomChoice() {
        int random = (int) (Math.random() * 3);
        if (random == 0) {
            return "rock";
        } else if (random == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }
}
