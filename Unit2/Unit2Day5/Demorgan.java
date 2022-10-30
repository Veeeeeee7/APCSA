package Unit2.Unit2Day5;

public class Demorgan {
    // Augustus De Morgan -16th british mathematician
    // Imcompleteness Theory - there are some statements that cant be proven as true
    // or false

    // 1. The negation of a disjunction is the conjunction of the negations
    // 2. The negation of a conjunction is the disjunction of the negations
    // disjunction = or
    // conjunction = and
    // negation = opposite

    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        boolean x = !(a || b);

        boolean y = !a && !b;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        boolean z = !(a && b);
        boolean w = !a || !b;

        System.out.println("z: " + z);
        System.out.println("w: " + w);
    }
}
