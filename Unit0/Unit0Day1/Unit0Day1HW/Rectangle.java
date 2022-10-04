package Unit0.Unit0Day1.Unit0Day1HW;

public class Rectangle {
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