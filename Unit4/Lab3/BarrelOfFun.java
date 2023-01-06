package Unit4.Lab3;

public class BarrelOfFun {
    private Monkey[][] barrel;

    // the constructor should fill barrel with munks
    public BarrelOfFun(int rows, int cols, Monkey[] munks) {
        barrel = new Monkey[rows][cols];
        int index = 0;
        for (int i = 0; i < barrel.length; i++) {
            for (int j = 0; j < barrel[i].length; j++) {
                if (index >= munks.length) {
                    break;
                }
                barrel[i][j] = munks[index];
                index++;
            }
        }
    }

    // this method should find the monkey with the most bananas
    public Monkey getMonkeyWithMostBananas() {
        Monkey mostBananas = null;
        for (int i = 0; i < barrel.length; i++) {
            for (int j = 0; j < barrel[i].length; j++) {
                if (barrel[i][j] == null) {
                    break;
                }
                if (mostBananas == null) {
                    mostBananas = barrel[i][j];
                } else if (barrel[i][j].getBananaCount() > mostBananas.getBananaCount()) {
                    mostBananas = barrel[i][j];
                }
            }
        }
        return mostBananas;
    }

    public String toString() {
        String result = "";

        for (int r = 0; r < barrel.length; r++) {
            for (int c = 0; c < barrel[r].length; c++) {
                result += "   " + barrel[r][c];
            }
            result += "\n";
        }
        return result;
    }
}