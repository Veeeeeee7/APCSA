package Unit5.PolygonLab;

public class Triangle extends Polygon {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public String toString() {
        return super.toString() + "\n It has area " + getArea() + ".\n It is, in fact, a triangle with base " + base
                + ", and height " + height + ".";
    }
}
