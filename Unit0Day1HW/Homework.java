package Unit0Day1HW;

public class Homework {
  
    public static class Rectangle {
        private int length;
        private int width;
    
        public Rectangle(int newLength, int newWidth) {
            length = newLength;
            width = newWidth;
        }
    
        public int getPerimeter() {
            return width * 2 + length * 2;
        }
    
        public int getArea() {
            return width * length;
        }
    }
    
    public static class Animal {
        
        private String name;
        private int age;
        private String breed;
        
        public Animal(String newName, int newAge, String newBreed){
            name = newName;
            age = newAge;
            breed = newBreed;
        }
        
        public String getDescription(){
            return "Hi! My name is " + name + ". I am a " + breed + ".";
        }
        
        public String getAge(){
            return "I am " + age + " years old.";
        }
    }
    
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("The rectangle's area is: " + rectangle.getArea());
        System.out.println("The rectangle's perimeter is: " + rectangle.getPerimeter());
        
        Animal animal = new Animal("Shadow", 4, "German Shepherd");
        System.out.println(animal.getDescription());
        System.out.println(animal.getAge());
    }
}
