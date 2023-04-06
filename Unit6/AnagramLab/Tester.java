package Unit6.AnagramLab;

public class Tester {
    public static void main(String[] args) {
        AnagramList tester = new AnagramList();

        Word word = new Word("pets");
        Word word2 = new Word("step");
        Word word3 = new Word("boat");

        tester.addWord(word);
        tester.addWord(word2);
        tester.addWord(word3);

        System.out.println("Are pets and step anagrams of each other? " + tester.checkAnagram(word, word2));

        System.out.println("Words that are anagrams of 'pest':");
        tester.printAnagrams("pest");

    }
}
