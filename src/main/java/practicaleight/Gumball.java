package practicaleight;

import java.util.Random;

/** Creates a gumball.
 *
 * @author Solutions Repository
 */
public class Gumball {

  private Random random = new Random();
  private String color = new String();

  /** Constructor.
   *
   */
  public Gumball() {
    switch(random.nextInt(5) + 1) {
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