package Unit2.Lab2;

public class ArrayOps {
    // 1) Create a static method called findMax that takes one parameter: an array
    // of ints. This method should
    // return the largest int in the array.

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // 2) Create a static method called findLongestString that takes one parameter:
    // an array of Strings.
    // This method should return the longest String in the array. If two Strings
    // have the longest length, return
    // the one that occurs first in the array.

    public static String findLongestString(String[] array) {
        String longest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > longest.length()) {
                longest = array[i];
            }
        }
        return longest;
    }

    // 3) Create a static method called averageStringLength that takes one
    // parameter: an array of
    // Strings. This method should return a double that represents the average
    // length of all Strings in the
    // array.

    public static double averageStringLength(String[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].length();
        }
        return sum / array.length;
    }

    // 4) Create a static method called countLetterFrequencies that takes one
    // parameter: a string of any length.
    // This method should return an array of 27 int values (indicies 0-26) where the
    // zero-index is meaningless but
    // each positive-index corresponds to a letter in the alphabet (1  A, 2  B, 3
    //  C, etc...) Therefore, the value
    // at each index represents the number of times that the corresponding letter
    // shows up in the input String.

    public static int[] countLetterFrequencies(String str) {
        int[] freq = new int[27];
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter >= 'A' && letter <= 'Z') {
                freq[letter - 'A' + 1]++;
            } else if (letter >= 'a' && letter <= 'z') {
                freq[letter - 'a' + 1]++;
            }
        }
        return freq;
    }

    // 5) Create a static method called removeIntAndScoot that takes two parameters:
    // the first is an array of
    // int values, the second is the index of the array element that should be
    // removed. This method should remove
    // the indicated element, shift all of the elements after it down one position,
    // assign a value of zero to the last
    // element in the array, and return the resulting array.
    // Do this without creating a new array.

    public static int[] removeIntAndScoot(int[] array, int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }

    // 6) Create a static method called resizeIntArray that takes one parameter: an
    // array of ints. This
    // method should create a new array twice the size of the input array, copy all
    // of the elements from the input array
    // into the new array, leave the second half of the new array as a sequence of
    // zeros, and finally return the new
    // larger array.
    // Do this by creating a new array.

    public static int[] resizeIntArray(int[] array) {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // 7) Create a static method called addNumToStringArray that takes one
    // parameter: an array of
    // Strings. This method should take each String in the array and add the number
    // symbol (#) and the element
    // number to the beginning of each String and return the modified array. For
    // example, if an array contained:
    // {“Hello”, “my”, “name”, “is”, “Larry”} then this method would return an array
    // with the contents: {“#0 Hello”,
    // “#1 my”, #2 name”, “#3 is”, “#4 Larry”}.
    // Do this without creating a new array.

    public static String[] addNumToStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = "#" + i + " " + array[i];
        }
        return array;
    }

    // 8) Create a static method called reverseIntArray that takes one parameter: an
    // array of ints. This
    // method should reverse the order of the elements in the array and return the
    // reversed array.
    // Do this by creating a new array.

    public static int[] reverseIntArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
        }
        return newArray;
    }

}