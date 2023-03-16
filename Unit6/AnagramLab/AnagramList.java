package Unit6.AnagramLab;

import java.util.List;
import java.util.ArrayList;

public class AnagramList {
    // instance variables
    private List<Word> wordList;

    // constructor
    public AnagramList() {
        wordList = new ArrayList<Word>();
    }

    // other methods

    /**
     * Adds a Word, whose original order is
     * newWord, to wordList.
     */
    public void addWord(Word newWord) {
        // to be completed
    }

    /**
     * Returns true if aWord and another Word have original
     * strings that are anagrams (words composed of
     * the same letter), otherwise returns false.
     */
    public boolean checkAnagram(Word aWord, Word anotherWord) {
        // to be completed
    }

    /**
     * Prints the original words of all Words in wordList that
     * are anagrams of the String key
     */
    public void printAnagrams(String key) {
        // to be completed
    }
}