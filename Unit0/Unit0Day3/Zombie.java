package Unit0.Unit0Day3;
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
    public Zombie(double height, double weight, int speed, boolean dead, String name) {
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.dead = dead;
        this.name = name;
    }

    //if you forget or don't initialize a variable in your constructor, it will default to it's "false" value. For primitives, it's 0 or false (boolean), and for classes it's null (causing a null pointer exception)

    //methods
    public void speak(){
        if(dead == true){
            System.out.println("Braaaaaaaaaaaaaaaaaaaaaaaaains!");
        }
        else{
            System.out.println("Good evening!");
        }
    }

    public String toString() {
        return "Hello! My name is " + this.name + ". I weight " + this.weight + "lbs and am " + this.height + "ft tall. I'm known to run " + this.speed + "mph! It's " + this.dead + " that I am dead.";
    }

    public boolean equals(Zombie otherZombie) {
        return this.weight == otherZombie.weight && this.height == otherZombie.height && this.speed == otherZombie.speed && this.dead == otherZombie.dead;
    }

    //getters
    public double getHeight() {
        return height;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public String getName() {
        return name;
    }

    public boolean getDead() {
        return dead;
    }

    //setters
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
}


