package Unit5.PolygonLab;

public class Rectangle extends Polygon {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        super(4);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return super.toString() + "\n It has area " + getArea() + ".\n It is a rectangle, with length " + length
                + " and width " + width + ".";
    }
}
