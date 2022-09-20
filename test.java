public class test {
    public static void main(String[] args) {
        String alpha = "abcdefghijklm";
        String digits = "109876543210";
        String digitPairs = "01 23 45 67 89 0";
        String s2 = "beat";
        String s3 = "even";

    System.out.println(alpha.length());
        System.out.println(alpha.compareTo(s2));
        System.out.println(s3.compareTo(alpha));
        System.out.println(s3.compareTo(s2.substring(1)));
        System.out.println(alpha.charAt(1));
        System.out.println(alpha.charAt(alpha.length()-1));
        System.out.println(alpha.charAt(9));
        System.out.println(alpha.substring(0,4));
        System.out.println(alpha.substring(5));
        System.out.println(alpha.substring(alpha.length()));
        System.out.println(alpha.substring(2,5));
        System.out.println(alpha.substring(2, alpha.length()));
        System.out.println(alpha.indexOf("abc"));
        System.out.println(alpha.indexOf("e"));
        System.out.println(alpha.indexOf("hij"));
        System.out.println(digits.indexOf("65"));
        System.out.println(digits.indexOf("24"));
        System.out.println(alpha.indexOf("c"));
        System.out.println(digitPairs.indexOf(" "));
        System.out.println(digits.indexOf(digitPairs.charAt(3)));
        System.out.println(digits.charAt(digitPairs.indexOf("3")));
    }
}