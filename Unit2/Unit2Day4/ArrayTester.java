package Unit2.Unit2Day4;

import java.util.Arrays;

public class ArrayTester {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("a: " + a + " b: " + b + " c: " + c);

        // array -> a list of values
        int[] integers = new int[100];

        integers[0] = 90;
        integers[26] = 260;

        Arrays.stream(integers).forEach(i -> System.out.print(i + " "));

        // arrays can hold primitive types or object data types
        String[] quotes = new String[4];

        quotes[0] = "yolo";
        quotes[1] = "bruh";
        quotes[2] = "what colors your bugatti";
        quotes[3] = "free gunna";

        System.out.println();
        Arrays.stream(quotes).forEach(q -> System.out.print(q + " "));
    }
}