package Unit0.Unit0Day2.Unit0Day2HW;

public class Tester {
    public static void main(String[] args) {
        Rectangle fredtangle = new Rectangle(5, 10);
        System.out.println("My area is: " + fredtangle.getArea());
        System.out.println("My perimeter is: " + fredtangle.getPerimeter());
        fredtangle.setLength(13);
        System.out.println("My new area is: " + fredtangle.getArea());

        System.out.println("\n");

        Rectangle breadtangle = new Rectangle(8, 3);
        System.out.println("My area is: " + breadtangle.getArea());
        System.out.println("My perimeter is: " + breadtangle.getPerimeter());
        breadtangle.setWidth(9);
        System.out.println("My new perimeter is: " + breadtangle.getPerimeter());

        System.out.println("\n");

        Animal fred = new Animal("Fred", 4, "German Shepherd");
        System.out.println(fred.description());
        System.out.println(fred.age());
        fred.setAge(5);
        System.out.println("I am now " + fred.getAge() + " years old.");

        System.out.println("\n");

        Animal bread = new Animal("Bread", 4, "Golden Retriever");
        System.out.println(bread.description());
        System.out.println(bread.age());
        bread.setName("Fread");
        System.out.println("My new name is " + bread.getName() + ".");
    }
}
