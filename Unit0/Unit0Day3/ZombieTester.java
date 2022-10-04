package Unit0.Unit0Day3;
public class ZombieTester {
    //Main Class, Tester Class, Driver Class, Runner Class
    public static void main(String[] args) {
        Zombie boot = new Zombie(13.0, 500.0, 90, true, "Cheddar");

        System.out.println(boot.getHeight());

        boot.setHeight(1.0);

        System.out.println(boot.getHeight());

        System.out.println(boot.getName());

        boot.speak();
        
        boot.setDead(false);
        boot.speak();

        Zombie parmesian = new Zombie(0.1, 20, 15, true, "parmeme");

        System.out.println(parmesian.getName());
        System.out.println(parmesian.toString());
    }
}
