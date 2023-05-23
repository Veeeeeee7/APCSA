package Unit8;

public class MyStringTester {

	static double score = 0.0;

	public static void main(String[] args) {

		MyString empty = new MyString();
		System.out.print("Should be empty: ");
		empty.print();
		System.out.println();

		MyString computer = convert("computer");
		String computerStr = "computer";
		System.out.print("Should be computer: ");
		computer.print();
		System.out.println();

		// Testing length
		System.out.println("Testing length");
		expectInt(empty.length(), 0);
		expectInt(computer.length(), 8);

		// Testing charAt
		System.out.println("Testing charAt");
		expectChar(computer.charAt(3), 'p');

		// Testing toLowerCase
		System.out.println("Testing toLowerCase");
		MyString hiWorld = convert("hI w0rLD");
		expectString(hiWorld.toLowerCase(), "hi w0rld");

		// Testing toUpperCase
		System.out.println("Testing toUpperCase");
		System.out.print("Should be HI W0RLD: ");
		expectString(hiWorld.toUpperCase(), "HI W0RLD");

		// Testing trim
		System.out.println("Testing trim");
		MyString um = convert("  um   ");
		expectString(um.trim(), "um");

		// Testing replace(char, char)
		System.out.println("Testing replace(char, char)");
		MyString misses = convert("misses");
		expectString(misses.replace('s', 'r'), "mirrer");

		// Testing replace(MyString, MyString)
		System.out.println("Testing replace(MyString, MyString)");
		MyString mississippi = convert("mississippi");
		MyString before = convert("iss");
		MyString after = convert("on");
		expectString(mississippi.replace(before, after), "mononippi");

		// Testing substring(from)
		System.out.println("Testing substring(from)");
		expectString(computer.substring(3), "puter");

		// Testing substring(from, to)
		System.out.println("Testing substring(from, to)");
		expectString(computer.substring(2, 5), "mpu");

		// Testing indexOf(ch)
		System.out.println("Testing indexOf(ch)");
		expectInt(mississippi.indexOf('i'), 1);
		expectInt(mississippi.indexOf('q'), -1);

		// Testing indexOf(ch, fromindex)
		System.out.println("Testing indexOf(ch, fromindex)");
		expectInt(mississippi.indexOf('i', 2), 4);

		// Testing indexOf(str)
		System.out.println("Testing indexOf(str)");
		expectInt(mississippi.indexOf(convert("ipp")), 7);
		expectInt(mississippi.indexOf(convert("hi")), -1);

		// Testing indexOf(str, fromindex)
		System.out.println("Testing indexOf(str, fromindex)");
		expectInt(mississippi.indexOf(convert("is"), 2), 4);

		// Testing contains
		System.out.println("Testing contains");
		expectBool(computer.contains(convert("ter")), true);
		expectBool(computer.contains(convert("pun")), false);

		// Testing split
		System.out.println("Testing split");
		expectArray(convert("boo:and:foo").split(convert(":")),
				"boo:and:foo".split(":"));

		// Testing add(char)
		System.out.println("Testing add(char)");
		expectString(computer.add('s'), "computers");

		// Testing add(MyString)
		System.out.println("Testing add(MyString)");
		expectString(computer.add(convert(" science")), "computer science");

		// Testing convertToInt
		System.out.println("Testing convertToInt");
		expectInt(convert("58325").convertToInt(), 58325);

		// Testing equals
		System.out.println("Testing equals");
		expectBool(computer.equals(mississippi), false);
		expectBool(computer.equals(convert("computer")), true);

		// Testing compareTo
		System.out.println("Testing compareTo");
		expectInt(computer.compareTo(convert("comp")), 4);
		expectInt(convert("com").compareTo(computer), -5);
		expectInt(computer.compareTo(mississippi), -10);
		expectInt(mississippi.compareTo(convert("mirth")), 1);

		System.out.println("FINAL SCORE (out of 70): " + score * 2.5);

	}

	private static void expectString(MyString changed, String expected) {
		System.out.print("Should be " + expected + ": ");
		changed.print();
		System.out.println();
		if (matchString(changed, expected))
			score++;
	}

	private static void expectChar(char result, char expected) {
		System.out.println("Should be " + expected + ": " + result);
		if (result == expected)
			score++;
	}

	private static void expectInt(int result, int expected) {
		System.out.println("Should be " + expected + ": " + result);
		if (result == expected)
			score++;
	}

	private static void expectBool(boolean result, boolean expected) {
		System.out.println("Should be " + expected + ": " + result);
		if (result == expected)
			score++;
	}

	private static void expectArray(MyString[] mystrs, String[] strs) {
		if (mystrs.length != strs.length) {
			System.out.println("Incorrect length!");
			return;
		}
		boolean correct = true;
		System.out.print("Should be [");
		for (int i = 0; i < strs.length - 1; i++) {
			System.out.print(strs[i] + ", ");
			if (!matchString(mystrs[i], strs[i]))
				correct = false;
		}
		System.out.print(strs[strs.length - 1] + "] : [");
		for (int i = 0; i < mystrs.length - 1; i++) {
			mystrs[i].print();
			System.out.print(", ");
		}
		mystrs[mystrs.length - 1].print();
		System.out.println("]");

		if (correct)
			score++;
	}

	private static boolean matchString(MyString mystr, String str) {
		if (mystr.length() != str.length())
			return false;
		for (int i = 0; i < str.length(); i++) {
			if (mystr.charAt(i) != str.charAt(i))
				return false;
		}
		return true;
	}

	private static MyString convert(String s) {
		return new MyString(s.toCharArray());
	}

}
