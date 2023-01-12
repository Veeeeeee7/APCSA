package Unit4.Day4;

import java.util.ArrayList;

public class TheBeatles {
    public static void main(String[] args) {
        String[] bandMembers = { "John", "Paul", "George", "Ringo" };
        bandMembers[0] = null;
        // { null, "Paul", "George", "Ringo" }

        printMembers(bandMembers);

        ArrayList<String> band = new ArrayList();
        band.add("John");
        band.add("Paul");
        band.add("George");
        band.add("Ringo");
        // { "John", "Paul", "George", "Ringo" }

        band.remove(1);

        band.add(1, "Lauren");
        // { "John", "Lauren", "George", "Ringo" }
    }

    public static void printMembers(String[] band) {
        for (int i = 0; i < band.length; i++) {
            if (band[i] != null) {
                System.out.println(band[i]);
            }
        }
    }
}
