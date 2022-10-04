package Unit1.Unit1Day1;

public class PrimitiveTester {
    public static void main(String[] args) {
        
        // escape characters

        System.out.print("this is line1");
        System.out.print("this is line 2");
        System.out.println();
        System.out.println();
        System.out.println();
        // print will keep text in the same line, println will add an escape character \n to make a new line at the end
        // \n creates a new line
        System.out.print("this is line 3 \nthis is line 4");

        System.out.println("\\n will print a backslash");
        // \\ creates a backslash
        
        System.out.println("this is a \"quote\"");
        // \" allows you to use double quote

        System.out.println("this is a single \'quote\'");
        // \' allows you to use single quote

        System.out.println("Rectangle: Length - 5, Width - 7 \t\tRectangle: Length - 8, Width - 9");
        
    }
}
