package Unit8;

public class Tester {
    public static void main(String[] args) {
        // test the split method
        MyString str = new MyString("computer".toCharArray());

        System.out.println(str.contains(new MyString("ter".toCharArray())));
    }
}
