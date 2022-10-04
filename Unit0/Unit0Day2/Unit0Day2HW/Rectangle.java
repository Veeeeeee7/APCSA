package Unit0.Unit0Day2.Unit0Day2HW;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int newLength, int newWidth) {
        length = newLength;
        width = newWidth;
    }


    //methods
    public int getPerimeter() {
        return width * 2 + length * 2;
    }

    public int getArea() {
        return width * length;
    }

    //setters
    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    //getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}