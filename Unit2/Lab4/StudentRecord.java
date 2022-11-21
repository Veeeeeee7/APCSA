package Unit2.Lab4;

public class StudentRecord {
    private int[] scores;
    private String name;

    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // returns the average (artithmetic mean) of the values in scores
    // whose subscripts are between first and last inclusive
    // precondition: 0 <= first <= last < scores.length
    private double average(int first, int last) {
        double sum = 0;
        for (int i = first; i <= last; i++) {
            sum += scores[i];
        }
        return sum / (last - first + 1);
    }

    // returns true if each successive value in scores is greater
    // than or equal to the previous value;
    // otherwise, returns false
    private boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // if the values in scores have improved, returns the average
    // of the elements in scores with indexes greater than or equal
    // to scores.length/2;
    // otherwise, returns the average of all of the values in scores
    public double finalAverage() {
        if (hasImproved()) {
            return average(scores.length / 2, scores.length - 1);
        } else {
            return average(0, scores.length - 1);
        }
    }

    public String toString() {
        String result = "";
        for (int k = 0; k < scores.length; k++) {
            result += scores[k] + " ";
        }
        return name + " has scores: " + result;
    }

    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }
}