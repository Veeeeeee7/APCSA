package Unit2.Lab3;

public class Robot {
    private int[] hall;
    private int pos; // current position (tile number) of Robot
    private boolean facingRight; // true means this Robot is facing right

    // postcondition: returns true if this robot has a wall immediately in
    // front of it, so it cannot move forward;
    // otherwise, returns false
    private boolean forwardMoveBlocked() {
        if (facingRight) {
            return (pos == hall.length - 1);
        } else {
            return (pos == 0);
        }
    }

    // postcondition: one move has been made according to the
    // specifications above and the state of this
    // Robot has been updated
    private void move() {
        if (facingRight) {
            pos++;
        } else {
            pos--;
        }
    }

    // postcondition: no more items remain in the hallway;
    // returns the number of moves made
    public int clearHall() {
        int moves = 0;
        while (hall[pos] > 0) {
            hall[pos]--;
            moves++;
            if (hall[pos] == 0) {
                if (forwardMoveBlocked()) {
                    facingRight = !facingRight;
                } else {
                    move();
                }
            }
        }
        return moves;
    }

    // postcondition: returns true if the hallway contains no items;
    // otherwise, returns false
    private boolean hallIsClear() {
        int count = 0;
        for (int k = 0; k < hall.length; k++)
            count += hall[k];
        return count == 0;

    }

    private void displayState() {
        for (int k = 0; k < hall.length; k++)
            System.out.print(" " + hall[k]);
        System.out.println();

        for (int k = 0; k < pos; k++)
            System.out.print("  ");

        if (facingRight)
            System.out.println(" >");
        else
            System.out.println(" <");
    }
}