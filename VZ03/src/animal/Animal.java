/**
 * Animal merupakan template untuk menciptakan hewan
 */

package animal;

import util.Point;
/** @author Marvin Jerremy Budiman (13515076).
 */

public abstract class Animal {
  private int weight;

  /** tamed bernilai true jika hewan jinak, false jika buas.
    */
  private boolean tamed;

  private Nature animalNature;

  private Point coordinate;

  /** Konstruktor kelas Animal<br>
    * I.S. sembarang<br>
    * F.S. weight berisi suatu nilai, animalNature tercipta, coordinate tercipta<br>
    * @param weight berat badan hewan<br>
    * @param absis absis hewan pada Zoo
    * @param ordinat ordinat hewan pada Zoo
    */
  public Animal(int weight,int absis,int ordinat) {
    this.weight = weight;
    animalNature = new Nature();
    coordinate = new Point(absis,ordinat);
  }

  /** I.S. sembarang<br>
    * F.S. tamed berisi suatu nilai<br>
    * @param tamed buas tidaknya suatu hewan<br>
    */
  public void setTamed(boolean tamed) {
    this.tamed = tamed;
  }

  /** I.S. sembarang<br>
    * F.S. sama dengan I.S.<br>
    * @return mengembalikan buas atau tidaknya suatu hewan<br>
    */
  public boolean getTamed() {
    return tamed;
  }

  /** I.S. sembarang<br>
    * F.S. sama dengan I.S.<br>
    * @return mengembalikan berat suatu hewan<br>
    */
  public int getWeight() {
    return weight;
  }

  /** I.S. sembarang<br>
    * F.S. sama dengan I.S.<br>
    * @return absis dari Animal
    */
  public int getAnimalAbsis() {
    return coordinate.getAbsis();
  }

  /** I.S. sembarang<br>
    * F.S. sama dengan I.S.<br>
    * @return ordinat dari Animal
    */
  public int getAnimalOrdinat() {
    return coordinate.getOrdinat();
  }

  /** I.S. sembarang<br>
    * F.S. animalNature terisi suatu nilai<br>
    * @param land bernilai true jika hewan darat<br>
    * @param water bernilai true jika hewan air<br>
    * @param air bernilai true jika hewan terbang<br>
    */
  public void setAnimalNature(boolean land, boolean water, boolean air) {
    animalNature.setStatus(land, water, air);
  }

  /** I.S. sembarang<br>
    * F.S. sama dengan I.S.<br>
    * @return mengembalikan animalNature<br>
    */
  public Nature getAnimalNature() {
    return animalNature;
  }

  /** Menampilkan interaksi Animal ke layar<br>
    * I.S. sembarang<br>
    * F.S. di layar tercetak bentuk interaksi hewan<br>
    */
  public abstract void interact();
}