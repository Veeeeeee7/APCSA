package Midterm;

public class Tester {
    public static void main(String[] args) {
        // Test MessagePiece

        // Creates two different MessagePiece objects
        MessagePiece piece1 = new MessagePiece(2, 5);
        MessagePiece piece2 = new MessagePiece(7, 3);

        // prints them
        System.out.println(piece1);
        System.out.println(piece2);

        // checks to see if they are equal
        System.out.println(piece1.equals(piece2));

        // calls the decode method on the first of them, passing the string
        // "jimquicklyrealizedthatthebeautifulgownsareexpensive"
        System.out.println(piece1.decode("jimquicklyrealizedthatthebeautifulgownsareexpensive"));
        System.out.println(piece2.decode("jimquicklyrealizedthatthebeautifulgownsareexpensive"));

        // Test MessageCryptography
        MessageCryptography test = new MessageCryptography("theotherthing");

        MessagePiece[] a = test.encode("oth thin");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                System.out.println("HI");

            }
            System.out.println(a[i]);
        }
        System.out.println("HI");
        System.out.println(test.decode(test.encode("oth thin")));

        // Test the message in the description
        String message1 = "The Lice Dove";
        String masterString = "thequickbrownfoxjumpedoverthelazydogs";

        // creates a MessageCryptography object with masterString
        MessageCryptography crypto = new MessageCryptography(masterString);

        // encodes message1 into an array of MessagePiece objects

        MessagePiece[] encoded = crypto.encode(message1);

        // prints each of the MessagePieces in the encoded array
        for (int i = 0; i < 140; i++) {
            if (encoded[i] != null) {
                System.out.println(encoded[i]);
            }
        }

        // decode the encoded message
        String decoded = crypto.decode(encoded);

        // prints decoded message
        System.out.println(decoded);

    }
}
