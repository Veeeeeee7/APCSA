package Unit1Lab;
import java.lang.Math;

public class test {
    public static void main(String[] args) {
        int count = 0;
        int dogID = 1234;
        int temp = 1;
        while (temp <= dogID) {
            temp *= 10;
            count++;
        }
        int sum = 0;

        for (int i = 1; i <= count; i++) {
            if (i > 1) {
                sum += (dogID/(Math.pow(10, i-1)))%10;
            }
            else {
                sum += dogID%10;
            }
        }
        System.out.println(sum);


    }
}
