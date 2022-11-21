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
        if (player.getChoice().compareTo(computer.getChoice()) == -3
                || (player.getChoice().compareTo(computer.getChoice()) >= 0
                        && player.getChoice().compareTo(computer.getChoice()) <= 2)) {
            return false;
        }
        return true;
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
