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
    // Create Scanner to take input
    Scanner input = new Scanner(System.in);
    // Prompt user for choice
    System.out.print("Would you like a gumball (y/n)?");
    String choice = input.nextLine().toUpperCase();
    // Create switch statement to handle choice
    switch (choice) {
      case "Y":
        // If "Y," create a new gumball
        Gumball gumball = new Gumball();
        // Print out the color
        System.out.print("You received a " + gumball + " one!");
        break;
      default:
        // Otherwise, it's too bad, so sad
        System.out.print("Oh, that's too bad.");
        break;
    }
  }
}