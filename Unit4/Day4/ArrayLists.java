package Unit4.Day4;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList rList = new ArrayList<String>();
        rList.add("apple");
        rList.add("pear");
        rList.add("banana");
        rList.add("grape");
        rList.add("peach");
        rList.add("pineapple");
        rList.add("orange");

        ArrayList rList2 = new ArrayList<String>();
        rList2.add("apple");
        rList2.add("pear");
        rList2.add("banana");
        rList2.add("grape");
        rList2.add("peach");
        rList2.add("pineapple");
        rList2.add("orange");

        System.out.println("Odd length count: " + countOddLength(rList));
        System.out.println("Odd length count: " + countOddLengthFEL(rList));

        System.out.println("removeString method - from the front of the Arraylist");
        removeStrings(rList, 'p');
        System.out.println(rList);

        System.out.println("removeString method - from the end of the Arraylist");
        removeStrings2(rList2, 'p');
        System.out.println(rList2);

        ArrayList numList = new ArrayList<Integer>();
        numList.add(5);
        numList.add(6);
        numList.add(5);
        numList.add(3);
        numList.add(3);
        numList.add(5);
        numList.add(2);
        System.out.println("number of fives: " + numCount(numList, 5));

    }

    // this method will return the number
    // of Strings in rayList with an odd length
    public static int countOddLength(ArrayList<String> rayList) {
        int count = 0;
        for (String i : rayList) {
            if (i.length() % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // this method will return the number
    // of Strings in rayList with an odd length using a for-each loop
    public static int countOddLengthFEL(ArrayList<String> rayList) {
        int count = 0;
        for (String i : rayList) {
            if (i.length() % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // this method will remove all Strings in rayList
    // that start with same first letter as firstLetter (removing from the front of
    // rayList)

    public static void removeStrings(ArrayList<String> rayList, char firstLetter) {
        ListIterator<String> iter = rayList.listIterator();
        while (iter.hasNext()) {
            if (iter.next().charAt(0) == firstLetter) {
                iter.remove();
            }
        }
    }

    // this method will remove all Strings in rayList
    // that start with same first letter as firstLetter (removing from the end of
    // rayList)
    public static void removeStrings2(ArrayList<String> rayList, char firstLetter) {
        ListIterator<String> iter = rayList.listIterator(rayList.size());
        while (iter.hasPrevious()) {
            if (iter.previous().charAt(0) == firstLetter) {
                iter.remove();
            }
        }
    }

    // this method will return the number
    // of times num is present in rayList using a for-each loop
    public static int numCount(ArrayList<Integer> rayList, int num) {
        int count = 0;
        for (int i : rayList) {
            if (i == num) {
                count++;
            }
        }
        return count;
    }
}
