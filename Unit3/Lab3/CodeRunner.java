package Unit3.Lab3;

public class CodeRunner {
    public static void main(String[] args) {
        Code code = new Code("ABCdef1234ghi456jklMNO");

        code.hide(2, 7);
        System.out.println(code);
        code.recover(5, 9);
        System.out.println(code);
        code.hide(3, 14);
        System.out.println(code);
        code.hide(6, 10);
        System.out.println(code);
        code.recover(5, 6);
        System.out.println(code);
        code.recover(0, 14);
        System.out.println(code);
    }
}