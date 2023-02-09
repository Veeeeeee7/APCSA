package Unit5.PolygonLab;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    public String toString() {
        return super.toString() + "\n Since the length and width are the same it is actually a square.";
    }
}
