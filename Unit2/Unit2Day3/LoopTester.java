package Unit2.Unit2Day3;

public class LoopTester {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {
            count++;
            System.out.println("count = " + count);
        }

        for (int i = 0; i < 10; i++) {
            count *= 2;
            System.out.println("i = " + i);
        }
    }
}
