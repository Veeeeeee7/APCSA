package Midterm;

public class MessageCryptography {
    // instance variable(s)
    private String masterString;

    // contructor(s)
    public MessageCryptography(String masterString) {
        this.masterString = masterString;
    }

    // setters and getters
    public String getMasterString() {
        return masterString;
    }

    public void setMasterString(String masterString) {
        this.masterString = masterString;
    }

    // helper methods
    // some recommendations:
    // Make a method that strips a message of all punctiation and capitalization
    // Make a method that finds the longest part of the message that is contained in
    // the master string
    public MessagePiece findLongest(String a) {
        int start = 0;
        int length = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j < a.length(); j++) {
                if (masterString.contains(a.substring(i, j))) {
                    if (j - i > length) {
                        start = i;
                        length = j - i;
                    }
                }
            }
        }
        return new MessagePiece(start, length);
    }

    public String clearSpaces(String message) {
        message.toLowerCase();
        String str = "";
        for (int i = 0; i < message.length(); i++) {
            if (masterString.charAt(i) > 96 && message.charAt(i) < 123) {
                str += masterString.charAt(i);
            }
        }
        return str;
    }

    public MessagePiece[] encode(String master) // takes the desried message and prints out Message pieces for the
                                                // desired output
    {
        MessagePiece[] encodedMessage = new MessagePiece[140];
        String cleanedMessage = clearSpaces(master); // clears message
        int index = 0;

        while (cleanedMessage != "") {
            MessagePiece temp = findLongest(master);
            MessagePiece longest = new MessagePiece(0, 0);

            int j = cleanedMessage.length();
            while (temp.getLength() == 0) {
                j--;
                temp = findLongest(master.substring(0, j));
            }
            if (temp.getLength() > longest.getLength()) {
                longest = temp;
            }
            encodedMessage[index] = longest;
            cleanedMessage = cleanedMessage.substring(longest.getLength());
        }
        return encodedMessage;
    }

    // the decode method

    public String decode(MessagePiece[] encoded) {
        String output = ""; // make a string to hold output
        for (int i = 0; i < encoded.length; i++) {
            if (encoded[i] != null) // check for null
            {
                for (int j = 0; j < encoded[i].getLength() - 1; j++) // itterate through a specific space within the
                                                                     // array
                {
                    // String new = encoded[i].decode(master);
                    // output += new;
                    output += masterString.charAt(encoded[i].getStart() + j);// get the char
                }
            }
        }

        return output;
    }

}