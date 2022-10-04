package Unit0.Unit0Day3.Unit0Day3HW;

public class Tester {
    public static void main(String[] args) {
        Rectangle fredtangle = new Rectangle(5, 10);
        System.out.println(fredtangle.toString());
        System.out.println("My area is: " + fredtangle.getArea());
        System.out.println("My perimeter is: " + fredtangle.getPerimeter());
        fredtangle.setLength(13);
        fredtangle.setWidth(15);
        System.out.println(fredtangle.toString());

        System.out.println("\n");

        Rectangle breadtangle = new Rectangle(8, 3);
        System.out.println(breadtangle.toString());
        System.out.println("My area is: " + breadtangle.getArea());
        System.out.println("My perimeter is: " + breadtangle.getPerimeter());
        breadtangle.setWidth(9);
        breadtangle.setLength(8);
        System.out.println(breadtangle.toString());

        System.out.println("\n");
        System.out.println(fredtangle.equals(breadtangle));
        System.out.println("\n");

        Animal fred = new Animal("Fred", 4, "German Shepherd");
        System.out.println(fred.toString());
        System.out.println(fred.greeting());
        System.out.println(fred.age());
        fred.setAge(5);
        fred.setName("Bred");
        fred.setBreed("Bulldog");
        System.out.println(fred.toString());

        System.out.println("\n");

        Animal bread = new Animal("Bread", 4, "Golden Retriever");
        System.out.println(bread.toString());
        System.out.println(bread.greeting());
        System.out.println(bread.age());
        bread.setName("Fread");
        bread.setAge(2);
        bread.setBreed("Poodle");
        System.out.println(bread.toString());

        System.out.println("\n");
        System.out.println(fred.equals(bread));
        System.out.println("\n");
    }
}
