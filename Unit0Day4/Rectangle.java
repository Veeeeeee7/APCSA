public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    //methods
    public int getPerimeter() {
        return width * 2 + length * 2;
    }

    public int getArea() {
        return width * length;
    }

    public String toString() {
        return "I am a rectangle with length " + length + " and width " + width;
    }

    public boolean equals(Rectangle otherRectangle) {
        return this.length == otherRectangle.length && this.width == otherRectangle.width;
    }

    //setters
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}