/**  Habitat menyatakan cell dengan jenis habitat pada Zoo
 */


package cell;

import animal.Nature;

/** @author Marvin Jerremy Budiman (13515076).
 */

public class Habitat extends Cell {
  private Nature habitatNature;
  private boolean isInCage;

  /**  Konstruktor kelas Habitat.
   * @param absis Absis dari Habitat
   * @param ordinat Ordinat dari Habitat
   */
  public Habitat(int absis, int ordinat) {
    super(absis,ordinat);
    isInCage = false;
    habitatNature = new Nature();
  }

  /** I.S. sembarang<br>
   * F.S. habitatNature terisi suatu nilai<br>
   * @param land bernilai true jika hewan darat<br>
   * @param water bernilai true jika hewan air<br>
   * @param air bernilai true jika hewan terbang<br>
   */
  public void setHabitatNature(boolean land, boolean water, boolean air) {
    habitatNature.setStatus(land, water, air);
  }

  /**  I.S. sembarang<br>
   * F.S. sama dengan I.S.<br>
   * @return mengembalikan habitatNature<br>
   */
  public Nature getHabitatNature() {
    return habitatNature;
  }

  /**  I.S. sembarang
    * F.S. sama dengan I.S.
    * @return nilai isInCage
    */
  public boolean isInCage() {
    return isInCage;
  }

  /**  I.S. sembarang
   * F.S. isInCage terisi suatu nilai
   * @param isInCage nilai untuk isInCage
   */
  public void setInCage(boolean isInCage) {
    this.isInCage = isInCage;
  }
}