package Unit2.Lab3;

public class RobotDriver {
    public static void main(String[] args) {
        int[] hall = { 1, 1, 2, 2 };
        Robot robby = new Robot(hall, 1);

        System.out.println(robby.clearHall());
    }
}