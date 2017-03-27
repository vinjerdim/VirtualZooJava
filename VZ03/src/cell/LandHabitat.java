/**  LandHabitat menyatakan Habitat untuk hewan yang hidup di darat
 */


package cell;

/** @author Marvin Jerremy Budiman (13515076).
 */

public class LandHabitat extends Habitat implements Renderable {

  /**  Konstruktor kelas LandHabitat.
   * I.S. sembarang
   * F.S. objek LandHabitat tercipta, habitatNature menjadi "land"
   * @param absis Absis dari Habitat
   * @param ordinat Ordinat dari Habitat
   */
  public LandHabitat(int absis, int ordinat) {
    super(absis, ordinat);
    setHabitatNature(true,false,false);
  }

  /**  @see cell.Renderable#render().
   */

  @Override
  public void render() {
    if (isInCage()) {
      System.out.print("D");
    } else {
      System.out.print("d");
    }
  }
}
