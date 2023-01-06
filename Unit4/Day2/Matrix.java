package Unit4.Day2;

public class Matrix {
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        fillMatrix(table);
        printMatrix(table);
    }

    public static void fillMatrix(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = i * 10 + j;
            }
        }
    }

    public static void printMatrix(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
