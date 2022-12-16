package Midterm;

public class MessagePiece {
    private int start;
    private int length;

    public MessagePiece(int start, int length) {
        this.start = start;
        this.length = length;
    }

    public int getStart() { // getter for the start variable
        return start;
    }

    public void setStart(int start) { // setter for the start variable
        this.start = start;
    }

    public int getLength() { // getter for the length
        return length;
    }

    public void setLength(int length) { // setter for the length
        this.length = length;
    }

    public String toString() { // prints out the start index and length
        return "Start: " + start + "\nLength: " + length;
    }

    public boolean equals(MessagePiece other) { // checks if 2 message pieces are the same
        if (this.start == other.start && this.length == other.length) {
            return true;
        }
        return false;
    }
    // decode method which takes a string as a parameter and returns the
    // appropriate piece of that string based on

    public String decode(String master) {
        MessageCryptography a = new MessageCryptography(master);
        MessagePiece[] b = { new MessagePiece(0, 4), new MessagePiece(6, 8) };
        return a.decode(b);

    }
}
