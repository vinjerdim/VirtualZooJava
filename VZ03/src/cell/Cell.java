/**  Cell merupakan superclass untuk semua jenis cell dalam Zoo
 */

package cell;

import zoo.Point;
/** @author Marvin Jerremy Budiman (13515076).
 */

public class Cell implements Renderable {
  private Point coordinate;

  /**  Konstruktor kelas Cell
   * I.S. sembarang
   * F.S. coordinate tercipta
   * @param absis absis dari cell
   * @param ordinat ordinat dari cell
   */
  public Cell(int absis,int ordinat) {
    coordinate = new Point(absis,ordinat);
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S
   * @return Point berupa koordinat Cell
   */
  public Point getCellCoordinate() {
    return coordinate;
  }

  /**  I.S. sembarang
   * F.S. sama dengan I.S.
   * @return absis dari cell
   */
  public int getCellAbsis() {
    return coordinate.getAbsis();
  }

  /**  I.S. sembarang
   * F.S. sama dengan I.S.
   * @return ordinat dari cell
   */
  public int getCellOrdinat() {
    return coordinate.getOrdinat();
  }

  /**  @see cell.Renderable#render().
   */
  @Override
  public void render() {
    System.out.print("#");
  }
}
