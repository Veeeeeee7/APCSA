package Unit5.Day1;

public class ZombieTester {
    public static void main(String[] args) {
        PartyZombie roen = new PartyZombie();
        System.out.println(roen.party());

        ConnoisseurZombie valeria = new ConnoisseurZombie("Valeria", true);
        System.out.println(valeria.bite());
    }
}
