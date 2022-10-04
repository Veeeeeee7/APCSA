package Unit0.Unit0LabPart2;

public class APLine {

    private Point p1;
    private Point p2;
    private int a;
    private int b;
    private int c;

    public APLine(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;

        this.a = -(p2.getY() - p1.getY());
        this.b = p2.getX() - p1.getX();
        this.c = -(this.a*p1.getX() + p1.getY()*this.b);
    }

    //methods
    public double getSlopeFromPoints() {
        return (double)(p2.getY() - p1.getY())/(p2.getX() - p1.getX());
    }

    public double getSlope() {
        return (double)-a/b;
    }

    public String getPointSlopeFormula() {
        return "y - " + String.valueOf(p1.getY()) + " = " + b/a + "(x + " + String.valueOf(p1.getX());
    }

    public boolean isOnLine(Point p) {
        return c == - (this.a*p.getX() + this.b*p.getY());
    }

    //getters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    //setters
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
}
