package Unit6.AnagramLab;

public class Word {
    // instance variables
    private String originalWord;
    private String sortedWord;

    // constructor
    public Word(String theWord) {
        originalWord = theWord;
        sortedWord = this.sortWord();
    }

    // setters and getters
    /**
     * Write the getters for each of the instance variables
     * below
     */
    public String getOriginalWord() {
        return originalWord;
    }

    public String getSortedWord() {
        return sortedWord;
    }

    public void setOriginalWord(String originalWord) {
        this.originalWord = originalWord;
    }

    public void setSortedWord(String sortedWord) {
        this.sortedWord = sortedWord;
    }

    // other methods
    /**
     * Returns the sorted version of the orignalWord
     * Example: if origninalWord = "apple",
     * "aelpp" is returned
     */
    private String sortWord() {
        // To be completed
        char[] chars = originalWord.toCharArray();
        for (int index = 1; index < chars.length; index++) {
            int key = numbers[index];
            int position = index;
            // shift larger values to the right
            while (position > 0 && numbers[position - 1] > key) {
                numbers[position] = numbers[position - 1];
                position--;
            }
            numbers[position] = key;
        }
    }
}
