package Unit4.Lab5;

import java.util.ArrayList;

public class TestResultsTester {

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

        String student1 = "Kevin";
        ArrayList<String> student1Answers = new ArrayList<String>();
        student1Answers.add("A");
        student1Answers.add("B");
        student1Answers.add("D");
        student1Answers.add("E");
        student1Answers.add("A");
        student1Answers.add("C");
        student1Answers.add("E");
        student1Answers.add("B");
        student1Answers.add("D");
        student1Answers.add("C");

        String student2 = "Steve";
        ArrayList<String> student2Answers = new ArrayList<String>();
        student2Answers.add("A");
        student2Answers.add("C");
        student2Answers.add("D");
        student2Answers.add("E");
        student2Answers.add("B");
        student2Answers.add("C");
        student2Answers.add("A");
        student2Answers.add("A");
        student2Answers.add("A");
        student2Answers.add("A");

        String student3 = "Joe";
        ArrayList<String> student3Answers = new ArrayList<String>();
        student3Answers.add("A");
        student3Answers.add("C");
        student3Answers.add("D");
        student3Answers.add("E");
        student3Answers.add("B");
        student3Answers.add("C");
        student3Answers.add("E");
        student3Answers.add("B");
        student3Answers.add("B");
        student3Answers.add("C");

        StudentAnswerSheet sheet1 = new StudentAnswerSheet(student1, student1Answers);
        StudentAnswerSheet sheet2 = new StudentAnswerSheet(student2, student2Answers);
        StudentAnswerSheet sheet3 = new StudentAnswerSheet(student3, student3Answers);

        ArrayList<StudentAnswerSheet> studentScores = new ArrayList<StudentAnswerSheet>();

        studentScores.add(sheet1);
        studentScores.add(sheet2);
        studentScores.add(sheet3);

        TestResults results = new TestResults(studentScores);
        System.out.println(results);
        String highestScore = results.highestScoringStudent(key);
        System.out.println("key \n" + key);
        System.out.println("\nThe student with the highest score is " + highestScore);
    }
}
