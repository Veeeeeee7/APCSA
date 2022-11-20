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

    }

    // returns true if each successive value in scores is greater
    // than or equal to the previous value;
    // otherwise, returns false
    private boolean hasImproved() {

    }

    // if the values in scores have improved, returns the average
    // of the elements in scores with indexes greater than or equal
    // to scores.length/2;
    // otherwise, returns the average of all of the values in scores
    public double finalAverage() {

    }

    public String toString() {
        String result = "";
        for (int k = 0; k < scores.length; k++) {
            result += scores[k] + " ";
        }
        return name + " has scores: " + result;
    }

}