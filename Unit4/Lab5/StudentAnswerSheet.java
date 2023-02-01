package Unit4.Lab5;

import java.util.ArrayList;

public class StudentAnswerSheet {
    // instance variables
    private String studentName;
    private ArrayList<String> answers; // the list of the student's answers

    // constructors
    public StudentAnswerSheet(String studentName, ArrayList<String> answers) {
        this.studentName = studentName;
        this.answers = answers;
    }

    // other methods
    /**
     * @param key the list of correct answers, represented as strings of length one
     *            Precondition: key.size() is equal to the number of answers in the
     *            answer sheet
     * @return this student's test score
     */
    public double getScore(ArrayList<String> key) {
        double score = 0;
        for (int i = 0; i < key.size(); i++) {
            if (answers.get(i).equals(key.get(i))) {
                score++;
            } else if (answers.get(i).equals("?")) {
                score += 0;
            } else {
                score -= 0.25;
            }
        }
        return score;
    }

    /**
     * @return the name of the student
     */
    public String getName() {
        return studentName;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setName(String name) {
        studentName = name;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public String toString() {
        return studentName + "\n" + answers;
    }
}
