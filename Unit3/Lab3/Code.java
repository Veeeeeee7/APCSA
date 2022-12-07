package Unit3.Lab3;

public class Code {
   private String myCode;
   private final String code;
   // additional instance variables

   public Code(String code) {
      this.myCode = code;
      this.code = code;
      // possibly additional statements
   }

   public String getCode() {
      return myCode;
   }

   // precondition: p1 >= 0, p1 < p2, p2 <= myCode.length()
   // Replace the characters in the code starting at
   // position p1 until position p2-1 inclusive with X

   public void hide(int p1, int p2) {
      // to be implemented
      for (int i = p1; i < p2; i++) {
         myCode = myCode.substring(0, i) + "X" + myCode.substring(i + 1);
      }
   }

   // precondition: p1 >= 0, p1 < p2, p2 <= myCode.length()
   // Restores to their original values the characters in the code starting at
   // position p1 until position p2-1 inclusive

   public void recover(int p1, int p2) {
      // to be implemented
      myCode = myCode.substring(0, p1) + code.substring(p1, p2) + myCode.substring(p2);
   }

   public String toString() {
      return myCode;
   }
}
