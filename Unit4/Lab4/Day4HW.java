package Unit4.Lab4;

import java.util.*;

public class Day4HW {
    public static void main(String[] args) {
        String[] strArray = { "first", "second", "third", "fourth", "fifth" };
        String[] strArray2 = { "one", "two", "three", "four", "five" };

        lastComesFirst(strArray);
        System.out.println("Array: last element first");
        printArray(strArray);

        firstComesLast(strArray2);
        System.out.println("Array: first element last");
        printArray(strArray2);

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("first");
        list1.add("second");
        list1.add("third");
        list1.add("fourth");
        list1.add("fifth");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        list2.add("four");
        list2.add("five");

        System.out.println("ArrayList: last element first");
        lastComesFirst(list1);
        System.out.println(list1);
        System.out.println("ArrayList: first element last");
        firstComesLast(list2);
        System.out.println(list2);

    }

    // method to print an array
    public static void printArray(String[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    // this method returns the input array but with the last element first.
    public static void lastComesFirst(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[arr.length - 1];
            arr[arr.length - 1] = arr[i];
            arr[i] = temp;
        }
    }

    // this method returns the input array but with the first element last.
    public static void firstComesLast(String[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            String temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
        }
    }

    // this method returns the input ArrayList but with the last element first.
    public static void lastComesFirst(ArrayList<String> arrList) {
        ListIterator<String> iter = arrList.listIterator();
        while (iter.hasNext()) {
            String temp = iter.next();
            iter.set(arrList.get(arrList.size() - 1));
            arrList.set(arrList.size() - 1, temp);
        }
    }

    // this method returns the input ArrayList but with the first element last.
    public static void firstComesLast(ArrayList<String> arrList) {
        ListIterator<String> iter = arrList.listIterator(arrList.size());
        while (iter.hasPrevious()) {
            String temp = iter.previous();
            iter.set(arrList.get(0));
            arrList.set(0, temp);
        }
    }
}
