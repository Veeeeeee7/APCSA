package Unit2.Unit2Day5;

public class ShortCircuit {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        // if java knows that the first statement is true, it will not bother checking
        // the second
        if (x < 0 && y > x) {
            System.out.println("HELLO");
        } else {
            System.out.println("WORLD");
        }

        int[] array = new int[10];

        array[0] = (int) (Math.random() * 10 + 1);
        array[1] = (int) (Math.random() * 10 + 1);
        array[2] = (int) (Math.random() * 10 + 1);
        array[3] = (int) (Math.random() * 10 + 1);
        array[4] = (int) (Math.random() * 10 + 1);
        array[5] = (int) (Math.random() * 10 + 1);
        array[6] = (int) (Math.random() * 10 + 1);
        array[7] = (int) (Math.random() * 10 + 1);
        array[8] = (int) (Math.random() * 10 + 1);
        array[9] = (int) (Math.random() * 10 + 1);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length && array[i] < array[i + 1]) {
                array[i] = array[i + 1];
            }
            System.out.println(array[i]);
        }

    }
}
