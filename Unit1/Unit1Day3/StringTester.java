package Unit1.Unit1Day3;

public class StringTester {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Hello world";

        System.out.println("are the two strings equals? " + (s1 == s2));

        String s3 = new String("Hello world");
        System.out.println("is s1 equal to s3? " + (s1 == s3));
        System.out.println("is s1 equal to s3? " + s1.equals(s3));
    }
}
