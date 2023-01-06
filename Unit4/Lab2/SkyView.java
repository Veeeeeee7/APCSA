package Unit4.Lab2;

public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols];
        int index = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                view[i][j] = scanned[index];
                index++;
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double sum = 0;
        int count = 0;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                sum += view[i][j];
                count++;
            }
        }
        return sum / count;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < view.length; i++) {
            for (int j = 0; j < view[i].length; j++) {
                str.append(view[i][j] + "\t");
            }
            str.append("\n");
        }
        return str.toString();
    }
}
