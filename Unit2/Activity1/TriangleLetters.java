package Unit2.Activity1;

public class TriangleLetters {
    public static void main(String[] args) {
        // printLetters1(3, 'A') returns a String in the following form
        // "A
        // AA
        // AAA"
        System.out.println(printLetters1(3, 'A'));

        // printLetters1(5, 'K') returns a String in the following form
        // "K
        // KK
        // KKK
        // KKKK
        // KKKKK"
        System.out.println(printLetters1(5, 'K'));

        // printLetters2(3, 'A') returns a String in the following form
        // "AAA
        // AA
        // A"
        System.out.println(printLetters2(3, 'A'));

        // printLetters2(5, 'K') returns a String in the following form
        // "KKKKK
        // KKKK
        // KKK
        // KK
        // K"
        System.out.println(printLetters2(5, 'K'));
    }

    public static String printLetters1(int numberOfRows, char letter) {
        String result = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                result += letter;
            }
            result += "\n";
        }
        return result;
    }

    public static String printLetters2(int numberOfRows, char letter) {
        String result = "";
        for (int i = numberOfRows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                result += letter;
            }
            result += "\n";
        }
        return result;
    }
}
