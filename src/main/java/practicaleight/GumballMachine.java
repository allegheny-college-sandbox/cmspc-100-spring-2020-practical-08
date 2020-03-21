package practicaleight;

import java.util.Scanner;

/** Implements a gumball machine.
 *
 * @author Solutions Repository
 */
public class GumballMachine {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Would you like a gumball (y/n)?");
    String choice = input.nextLine().toUpperCase();
    
    switch (choice) {
      case "Y":
        Gumball gumball = new Gumball();
        System.out.print("You received a " + gumball + " one!");
        break;
      default:
        System.out.print("Oh, that's too bad.");
        break;
    }
  }
}