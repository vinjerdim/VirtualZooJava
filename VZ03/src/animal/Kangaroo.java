/**  Kangaroo merupakan kelas riil turunan Animal<br>
 * Merupakan hewan buas dan nature-nya di darat<br>
 */
package animal;

/** @author Patrick NH (13515040).
 */

public class Kangaroo extends Animal implements Mammal {
  /** Konstruktor kelas Animal<br>
   * I.S. sembarang<br>
   * F.S. habitat_status diinisiasi menjadi land, tamed diisi false, jumlah daging bertambah<br>
   * @param weight berat badan Kangaroo
   * @param absis absis lokasi Kangaroo
   * @param ordinat ordinat lokasi Kangaroo
   */
  public Kangaroo(int weight,int absis,int ordinat) {
    super(weight,absis,ordinat);
    super.setAnimalNature(true,false,false);
    super.setTamed(false);
    Consumption.addVegetableAmount(weight * 0.7);
  }

  /**  @see animal.Animal#interact().
   */

  @Override
  public void interact() {
    System.out.println("Kangaroo mengacungkan tinjunya padamu");
  }
  /**  @see animal.Mammal#mammalInteract().
   */

  @Override
  public void mammalInteract() {
    System.out.println("I'm a Kangaroo and I'm a mammal");
  }
}

