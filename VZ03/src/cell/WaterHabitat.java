/**
 * WaterHabitat menyatakan Habitat untuk hewan yang hidup di air
 */

package cell;

/**
 * @author Marvin Jerremy Budiman (13515076).
 */
public class WaterHabitat extends Habitat implements Renderable {

  /**
   * Konstruktor kelas WaterHabitat.
   * I.S. sembarang
   * F.S. objek WaterHabitat tercipta, habitatNature menjadi "water"
   * @param absis Absis dari Habitat
   * @param ordinat Ordinat dari Habitat
   */
  public WaterHabitat(int absis, int ordinat) {
    super(absis, ordinat);
    setHabitatNature(false,true,false);
  }

  /**
   * @see cell.Renderable#render()
   */
  @Override
  public void render() {
    if (isInCage()) {
      System.out.print("A");
    } else {
      System.out.print("a");
    }
  }
}
