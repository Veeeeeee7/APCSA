package Unit6.Day3;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(iterativeFactorial(5));
    }

    public static int iterativeFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int recursiveFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * recursiveFactorial(n - 1);
        }
    }
}
