package Unit4.Day1;

public class CatClient {
    private String name;
    private int age;
    private String color;
    private boolean isDirty;

    public CatClient(String name, int age, String color, boolean isDirty) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isDirty = isDirty;
    }

    public void bathe() {
        System.out.println("We're currently washing " + name + ", uwaah!");
        isDirty = false;
        speak();
    }

    public void speak() {
        System.out.println("Meow!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean isDirty) {
        this.isDirty = isDirty;
    }
}
