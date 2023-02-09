package Unit5.TicketLab;

public class Tester {
    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[3];
        tickets[0] = new WalkUp();
        tickets[1] = new Advance(5);
        tickets[2] = new StudentAdvance(10);

        for (Ticket ticket : tickets) {
            System.out.println(ticket);
            System.out.println();
        }
    }
}
