package Unit5.PolygonLab;

public abstract class Polygon {
    private int sideCount;

    public Polygon(int sideCount) {
        this.sideCount = sideCount;
    }

    public int getSideCount() {
        return sideCount;
    }

    public abstract double getArea();

    public String toString() {
        return "This polygon has " + sideCount + " sides.";
    }
}
