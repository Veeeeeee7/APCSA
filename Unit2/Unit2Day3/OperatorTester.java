package Unit2.Unit2Day3;

public class OperatorTester {
    public static void main(String[] args) {
        // increment operators
        int x = 1;
        x += 1; // adds 1 to x and assigns it back to x
        x = x + 1; // adds 1 to x and assigns it back to x
        x++; // adds 1 to x and assigns it back to x

        // decrement operators
        int y = 1;
        y -= 1; // subtracts 1 from y and assigns it back to y
        y = y - 1; // subtracts 1 from y and assigns it back to y
        y--; // subtracts 1 from y and assigns it back to y

        // assignment operators
        x += 4; // adds 4 to x and assigns it back to x
        y -= 5; // subtracts 5 from y and assigns it back to y
        x *= 3; // multiplies x by 3 and assigns it back to x
        y /= 9; // divides y by 9 and assigns it back to y
        x %= 3; // divides x by 3 and assigns the remainder back to x

    }
}
