/**  Restaurant menyatakan restaurant pada Zoo
 */

package cell;

/** @author Patrick NH (13515040).
 */

public class Restaurant extends Facility implements Renderable {

  /**  Konstruktor kelas Restaurant
   * I.S. sembarang
   * F.S. tercipta objek Restaurant
   * @param absis Absis dari Restaurant
   * @param ordinat Ordinat dari Restaurant
   */
  public Restaurant(int absis, int ordinat) {
    super(absis, ordinat);
  }

  /**  @see cell.Renderable#render().
   */

  @Override
  public void render() {
    System.out.print("$");
  }

}
