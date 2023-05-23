package Unit8;

import java.util.ArrayList;

public class MyString implements Comparable<MyString> {

    private char[] chars;

    // Constructs a new empty MyString
    public MyString() {
        chars = new char[0];
    }

    // Constructs a new MyString by COPYING
    // the chars from the given array;
    // if the chars in that array later change,
    // the MyString should not be affected
    // this.chars should be IMMUTABLE
    public MyString(char[] chars) {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];
        }
    }

    // Prints the contents of MyString to System.out
    public void print() {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }

    // For all methods below without comments: see
    // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
    // for explanations of what the parameters
    // mean and what they should return

    public int length() {
        return chars.length;
    }

    public MyString substring(int from, int to) {
        char[] newStr = new char[to - from];
        for (int i = from; i < to; i++) {
            newStr[i - from] = chars[i];
        }
        return new MyString(newStr);
    }

    public MyString substring(int from) {
        return substring(from, chars.length);
    }

    public int indexOf(char ch) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(char ch, int fromindex) {
        for (int i = fromindex; i < chars.length; i++) {
            if (chars[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    private int hash(char[] chars, int MOD) {
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum += ((chars[i] - 'a') * Math.pow(26, i)) % MOD;
        }
        return sum;
    }

    public int indexOf(MyString str) {
        if (str.length() > chars.length) {
            return -1;
        }

        str.toLowerCase();
        int hash = hash(str.chars, 1000000007);
        for (int i = 0; i < chars.length - str.length() + 1; i++) {
            MyString sub = substring(i, i + str.length());
            sub.toLowerCase();
            if (hash(sub.chars, 1000000007) == hash) {
                if (sub.equals(str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int indexOf(MyString str, int fromindex) {
        if (str.length() > chars.length) {
            return -1;
        }

        str.toLowerCase();
        int hash = hash(str.chars, 1000000007);
        for (int i = fromindex; i < chars.length - str.length() + 1; i++) {
            MyString sub = substring(i, i + str.length());
            sub.toLowerCase();
            if (hash(sub.chars, 1000000007) == hash) {
                if (sub.equals(str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    // Creates a new MyString with all instances of the char before
    // replaced with the char after
    public MyString replace(char before, char after) {
        char[] newStr = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == before) {
                newStr[i] = after;
            } else {
                newStr[i] = chars[i];
            }
        }
        return new MyString(newStr);
    }

    // Creates a new MyString with all instances of the substring before
    // replaced with the substring after
    public MyString replace(MyString before, MyString after) {
        MyString[] split = splitWithSpace(before);
        MyString newStr = new MyString();
        for (int i = 0; i < split.length; i++) {
            newStr = newStr.add(split[i]);
            if (i < split.length - 1) {
                newStr = newStr.add(after);
            }
        }
        return newStr;
    }

    public boolean contains(MyString str) {
        return indexOf(str) > -1;
    }

    public char charAt(int index) {
        return chars[index];
    }

    // Returns an array of MyStrings containing the different substrings
    // of this MyString, divided by the divider
    // E.g.: if MyString were "the brown fox" and divider were " ",
    // this would return ["the", "brown", "fox"]
    public MyString[] split(MyString divider) {
        ArrayList<MyString> strList = new ArrayList<MyString>();
        int index = 0;
        while (index < chars.length && indexOf(divider, index) > -1) {
            int endIndex = indexOf(divider, index);
            if (index != endIndex) {
                strList.add(substring(index, endIndex));
            }
            index = endIndex + divider.length();
        }
        strList.add(substring(index));

        return strList.toArray(new MyString[strList.size()]);
    }

    private MyString[] splitWithSpace(MyString divider) {
        ArrayList<MyString> strList = new ArrayList<MyString>();
        int index = 0;
        while (index < chars.length && indexOf(divider, index) > -1) {
            int endIndex = indexOf(divider, index);
            strList.add(substring(index, endIndex));
            index = endIndex + divider.length();
        }
        strList.add(substring(index));

        return strList.toArray(new MyString[strList.size()]);
    }

    public MyString trim() {
        int front = 0;
        int frontIndex = 0;
        while (chars[frontIndex] == ' ') {
            front++;
            frontIndex++;
        }

        int back = 0;
        int backIndex = chars.length - 1;
        while (chars[backIndex] == ' ') {
            back++;
            backIndex--;
        }

        char[] newStr = new char[chars.length - front - back];
        for (int i = front; i < chars.length - back; i++) {
            newStr[i - front] = chars[i];
        }

        return new MyString(newStr);
    }

    // Returns a new MyString where the only chars changed are chars from A-Z,
    // which are changed to a-z
    public MyString toLowerCase() {
        char[] newStr = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                newStr[i] = (char) (chars[i] + 32);
            } else {
                newStr[i] = chars[i];
            }
        }
        return new MyString(newStr);
    }

    // Returns a new MyString where the only chars changed are chars from a-z,
    // which are changed to A-Z
    public MyString toUpperCase() {
        char[] newStr = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                newStr[i] = (char) (chars[i] - 32);
            } else {
                newStr[i] = chars[i];
            }
        }
        return new MyString(newStr);
    }

    // Returns a new MyString that is this MyString concatenated together
    // with the other MyString
    public MyString add(MyString other) {
        char[] newStr = new char[chars.length + other.length()];
        for (int i = 0; i < chars.length; i++) {
            newStr[i] = chars[i];
        }
        for (int i = 0; i < other.length(); i++) {
            newStr[i + chars.length] = other.charAt(i);
        }
        return new MyString(newStr);
    }

    public MyString add(char c) {
        char[] newStr = new char[chars.length + 1];
        for (int i = 0; i < chars.length; i++) {
            newStr[i] = chars[i];
        }
        newStr[chars.length] = c;
        return new MyString(newStr);
    }

    // If the MyString represents an integer, positive or negative,
    // returns the int that it represents
    // If the MyString is NOT an integer, throws a NumberFormatException
    public int convertToInt() {
        int num = 0;
        int sign = chars[0] == '-' ? 1 : 0;
        for (int i = sign; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                num *= 10;
                num += chars[i] - '0';
            } else {
                throw new NumberFormatException();
            }
        }
        return sign == 1 ? -num : num;
    }

    public boolean equals(MyString other) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != other.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public int compareTo(MyString other) {
        int length = chars.length < other.length() ? chars.length : other.length();
        for (int i = 0; i < length; i++) {
            if (chars[i] != other.charAt(i)) {
                return chars[i] - other.charAt(i);
            }
        }
        if (chars.length != other.length()) {
            return chars.length - other.length();
        }
        return 0;
    }
}
