package Unit0.Unit0LabPart2;

public class APLineTester {
    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(8, 10);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(11, 17);

        APLine pointLine = new APLine(p1, p2);

        System.out.println("The slope of the line from a and b is: " + pointLine.getSlope());
        System.out.println("The slope of the line from points is: " + pointLine.getSlopeFromPoints());

        System.out.println("Point 1 is on the line? " + pointLine.isOnLine(p1));
        System.out.println("Point 2 is on the line? " + pointLine.isOnLine(p2));
        System.out.println("Point 3 is on the line? " + pointLine.isOnLine(p3));
        System.out.println("Point 4 is on the line? " + pointLine.isOnLine(p4));
    }
}

