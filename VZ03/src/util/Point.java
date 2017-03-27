/**  Point menyimpan koordinat dari suatu Cell atau Animal
 * absis dihitung dari kiri
 * ordinat dihitung dari atas
 */

package util;

/** @author Marvin Jerremy Budiman (13515076).
 */

public class Point {
  private int absis;

  private int ordinat;

  /**  Konstruktor kelas Point.
   * @param absis absis dari suatu objek
   * @param ordinat ordinat dari suatu objek
   */

  public Point(int absis,int ordinat) {
    this.absis = absis;
    this.ordinat = ordinat;
  }

  /**  I.S. sembarang
   * F.S. absis terisi dengan suatu nilai
   * @param absis absis dari suatu objek
   */

  public void setAbsis(int absis) {
    this.absis = absis;
  }

  /**  I.S. sembarang
   * F.S. ordinat terisi dengan suatu nilai
   * @param ordinat ordinat dari suatu objek
   */

  public void setOrdinat(int ordinat) {
    this.ordinat = ordinat;
  }

  /**  @return absis dari objek Point
   */

  public int getAbsis() {
    return absis;
  }

  /**  @return absis dari objek Point
   */

  public int getOrdinat() {
    return ordinat;
  }
}