package practicaleight;

import java.util.Random;

/** Creates a gumball.
 *
 * @author Solutions Repository
 */
public class Gumball {

  private final Random random = new Random();
  private final String color;

  /** Constructor.
   *
   */
  public Gumball() {
    int color = random.nextInt(5) + 1;
    switch(color) {
      case 1:
        this.color = "pink";
        break;
      case 2:
        this.color = "red";
        break;
      case 3:
        this.color = "purple";
        break;
      case 4:
        this.color = "cyan";
        break;
      case 5:
        this.color = "yellow";
    }
  }
  
  /** Creates a String representation.
   *
   */
  public String toString() {
    return this.color;
  }
}