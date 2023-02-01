package Unit4.Lab5;

import java.util.ArrayList;

public class StudentAnswerSheetTester {

    public static void main(String[] args) {
        ArrayList<String> key = new ArrayList<String>();
        key.add("A");
        key.add("C");
        key.add("D");
        key.add("E");
        key.add("B");
        key.add("C");
        key.add("E");
        key.add("B");
        key.add("B");
        key.add("C");

        ArrayList<String> studentAnswers = new ArrayList<String>();
        studentAnswers.add("A");
        studentAnswers.add("B");
        studentAnswers.add("D");
        studentAnswers.add("E");
        studentAnswers.add("A");
        studentAnswers.add("C");
        studentAnswers.add("?");
        studentAnswers.add("B");
        studentAnswers.add("D");
        studentAnswers.add("C");

        StudentAnswerSheet student1 = new StudentAnswerSheet("Kevin", studentAnswers);
        System.out.println(student1);

        double score = student1.getScore(key);

        System.out.println("\n" + score);
    }
}
