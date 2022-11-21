package Unit2.Lab4;

public class Course {
    String courseName;
    StudentRecord[] myCourse;

    public Course(String courseName, StudentRecord[] myCourse) {
        this.courseName = courseName;
        this.myCourse = myCourse;
    }

    public String computeBestStudent() {
        double bestAverage = Double.MIN_VALUE;
        StudentRecord bestStudent = myCourse[0];
        for (int i = 1; i < myCourse.length; i++) {
            if (myCourse[i].finalAverage() > bestAverage) {
                bestAverage = myCourse[i].finalAverage();
                bestStudent = myCourse[i];
            }
        }
        return bestStudent.getName();
    }

    public double testAverage(int testNumber) {
        double sum = 0;
        for (int i = 0; i < myCourse.length; i++) {
            sum += myCourse[i].getScores()[testNumber];
        }
        return sum / myCourse.length;
    }
}
