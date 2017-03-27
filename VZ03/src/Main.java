/**  Main program untuk Virtual Zoo
 */

import animal.*;

/** @author Marvin Jerremy Budiman (13515076).
 */

public class Main {

  /** @param args Argumen untuk Main.
   */
  public static void main(String[] args) {
    Lion lion1 = new Lion(50,1,1);
    System.out.println(Consumption.getMeatAmount());
    lion1.interact();
    lion1.mammalInteract();
  }
}
