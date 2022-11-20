package Unit3.Day1;

public class Survivor {
    private String name;
    private int health;
    private String status;
    private boolean isHungry;

    // the this reference is the computer's way of saying my or me
    // scope -> this reference also means global, which can be used throughout the
    // entire class
    // local -> can only be used inside a block {}
    public Survivor(String name, int health, String status, boolean isHungry) {
        this.name = name;
        this.health = health;
        this.status = status;
        this.isHungry = isHungry;
    }

    public void eat(Food meal) {
        if (meal instanceof Food) {
            health += meal.getNutrition();
        } else {
            health -= meal.getNutrition();
            status = "Sick";
        }
    }

    // overload -> same method name, different parameters
    public void eat(Rock rock) {
        if (rock instanceof Rock) {
            health += rock.getNutrition();
            status = "Sick";
        }
    }

    public void eat(Object thing) {
        if (thing instanceof Food) {
            eat(thing);
        } else {
            status = "Tummy Ache";
        }
    }
}
