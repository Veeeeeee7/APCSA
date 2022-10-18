package Unit2.Lab1;

import java.util.Scanner;

public class GameDriver {
    public static void main(String[] args) {
        Player player = new Player();
        Computer computer = new Computer();
        GameManager game = new GameManager(player, computer);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your choice: ");
        String choice = scanner.nextLine();
        choice = choice.toLowerCase();
        scanner.close();

        game.setPlayerInformation(name, choice);

        System.out.println("\n" + game.getPlayer() + ". " + game.getComputer() + ".\n");
        System.out.println(game.didPlayerWin() ? "Congratulations!!\n" : "Better Luck Next Time.\n");

    }
}
