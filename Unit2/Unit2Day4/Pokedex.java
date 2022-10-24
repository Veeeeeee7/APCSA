package Unit2.Unit2Day4;

import java.util.Arrays;

public class Pokedex {
    public static void main(String[] args) {
        Pokemon[] pokedex = new Pokemon[200];

        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass", 45, 49);
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 35, 55);
        Pokemon meowth = new Pokemon("Meowth", "Normal", 40, 45);

        pokedex[1] = bulbasaur;
        pokedex[25] = pikachu;
        pokedex[52] = meowth;

        pokedex[150] = new Pokemon("Mewtwo", "Psychic", 106, 110);

        Arrays.stream(pokedex).forEach(i -> System.out.print(i + " "));
    }
}
