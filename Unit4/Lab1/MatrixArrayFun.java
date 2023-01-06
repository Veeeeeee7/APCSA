package Unit4.Lab1;

public class MatrixArrayFun {

    private int[][] mat;

    // fill in mat with random integers from 0-9. mat has rowNumber rows and
    // ColNumber columns
    public MatrixArrayFun(int rowNumber, int colNumber) {
        mat = new int[rowNumber][colNumber];
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                mat[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    // write the getter for this class
    public int[][] getMat() {
        return mat;
    }

    // complete the method replaceAll below.
    // replaceAll will replace all oldVal in mat with newVal
    public void replaceAll(int oldVal, int newVal) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == oldVal) {
                    mat[i][j] = newVal;
                }
            }
        }
    }

    // Complete method swapRows below.
    // swapRows will swap rowOne and rowTwo in mat
    public void swapRows(int rowOne, int rowTwo) {
        for (int i = 0; i < mat[rowOne].length; i++) {
            int temp = mat[rowOne][i];
            mat[rowOne][i] = mat[rowTwo][i];
            mat[rowTwo][i] = temp;
        }
    }

    // Write the toString method below.
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                str.append(mat[i][j] + "\t");
            }
            str.append("\n");
        }
        return str.toString();
    }

}
