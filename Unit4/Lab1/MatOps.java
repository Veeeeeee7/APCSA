package Unit4.Lab1;

public class MatOps {
    // Complete method countIt below.
    // countIt will return the number of times that val occurs in mat
    public static int countIt(int[][] mat, int val) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == val) {
                    count++;
                }
            }
        }
        return count;
    }

    // Complete method countOdds below.
    // countOdds will return the number of odd numbers that exist in mat
    public static int countOdds(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] % 2 == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}