package Unit0Lab;
public class APLine {
    private int a;
    private int b;
    private int c;

    public APLine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //methods
    public double getSlope() {
        return (double)-a/b;
    }

    public boolean isOnLine(int x, int y) {
        return a*x + b*y + c == 0;
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
}
