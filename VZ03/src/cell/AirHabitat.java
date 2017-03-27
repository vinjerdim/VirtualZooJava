/**  AirHabitat menyatakan Habitat untuk hewan yang terbang
 */


package cell;

/** @author Marvin Jerremy Budiman (13515076).
 */

public class AirHabitat extends Habitat implements Renderable {

  /**  Konstruktor kelas AirHabitat.
   * I.S. sembarang
   * F.S. objek AirHabitat tercipta, habitatNature menjadi "air"
   * @param absis Absis dari Habitat
   * @param ordinat Ordinat dari Habitat
   */
  public AirHabitat(int absis, int ordinat) {
    super(absis, ordinat);
    setHabitatNature(false,false,true);
  }

  /**  @see cell.Renderable#render().
   */

  @Override
  public void render() {
    if (isInCage()) {
      System.out.print("U");
    } else {
      System.out.print("u");
    }
  }
}
