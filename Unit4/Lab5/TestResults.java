package Unit4.Lab5;

import java.util.ArrayList;

public class TestResults {
    // instance variables
    private ArrayList<StudentAnswerSheet> sheets;

    // constructors
    /**
     * constructors need to be added
     */
    public TestResults(ArrayList<StudentAnswerSheet> sheets) {
        this.sheets = sheets;
    }

    /**
     * Precondition: sheets.size() > 0;
     * all answer sheets in sheets have the same number of answers
     * 
     * @param key the list of correct answers represented as strings of length one
     *            Precondition: key.size() is equal to the number of answers
     *            in each of the answer sheets in sheets
     */

    public String highestScoringStudent(ArrayList<String> key) {
        double highestScore = sheets.get(0).getScore(key);
        String highestScoringStudent = sheets.get(0).getName();
        for (int i = 1; i < sheets.size(); i++) {
            if (sheets.get(i).getScore(key) > highestScore) {
                highestScore = sheets.get(i).getScore(key);
                highestScoringStudent = sheets.get(i).getName();
            }
        }
        return highestScoringStudent;
    }

    public ArrayList<StudentAnswerSheet> getSheets() {
        return sheets;
    }

    public void setSheets(ArrayList<StudentAnswerSheet> sheets) {
        this.sheets = sheets;
    }

    public String toString() {
        String result = "";
        for (int k = 0; k < sheets.size(); k++) {
            result += sheets.get(k) + "\n";
        }
        return result;
    }
}
