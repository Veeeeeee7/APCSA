package Unit2.Unit2Day3;

import java.util.Scanner;

public class ScannerTester {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.next(); // save whatever comes before the first space

        System.out.println("What is your age?");
        int age = scanner.nextInt(); // save the next integer

        System.out.println("True or False, do you like to Comp Sci?");
        boolean favComp = scanner.nextBoolean(); // save the next boolean typed

        System.out.println("Did you enjoy doing the survey?");
        scanner.nextLine();
        String answer = scanner.nextLine(); // save the next line (until the user presses enter)

        System.out.println(String.format(
                "Hello %1$s. You are %2$s years old, and it is %3$s that you like comp sci. You also said %4$s to enjoying the survey.",
                name, age, favComp, answer));

        scanner.close();
    }
}
