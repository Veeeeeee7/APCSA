public class Zombie {

    //Primitive data types
    //8 primitive data types
    //integer == any whole number, including 0 and negative numbers
    //double == any decimal
    //boolean == true/false
    //char == single character , each char has an integer value you can perform basica math operations 'a' = 97
    //long == long decimal
    //float == decimal
    //short == decimal
    //byte == 0 or 1


    //String == class  == a blueprint for a new datatype
        // a collection of characters
    
    /*
     * Instance Variables
     * Attributes that you can define for your object class (in this case a Zombie)
     */
    
    private double height;
    private double weight;
    private int speed;
    private boolean dead;
    private String name;

    //java is a type-safe language
    //Swift is also type-safe, but lax when declaring variables


    //Constuctors
    //initialize and instantiate new objects (in this case it creates a zombie with the attributes specified)
    public Zombie(double newHeight, double newWeight, int newSpeed, boolean isDead, String zombieName) {
        height = newHeight;
        weight = newWeight;
        speed = newSpeed;
        dead = isDead;
        name = zombieName;
    }

    //if you forget or don't initialize a variable in your constructor, it will default to it's "false" value. For primitives, it's 0 or false (boolean), and for classes it's null (causing a null pointer exception)

    public String getName() {
        return name;
    }
}
