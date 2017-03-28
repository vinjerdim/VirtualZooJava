/**  Koala merupakan kelas riil turunan Animal<br>
 * Merupakan hewan jinak dan nature-nya di darat<br>
 */
package animal;


/** @author Patrick NH (13515040).
 */

public class Koala extends Animal implements Mammal {
  /** Konstruktor kelas Animal<br>
   * I.S. sembarang<br>
   * F.S. habitat_status diinisiasi menjadi land, tamed diisi false, jumlah daging bertambah<br>
   * @param weight berat badan Koala
   * @param absis absis lokasi Koala
   * @param ordinat ordinat lokasi Koala
   */
  public Koala(int weight,int absis,int ordinat) {
    super(weight,absis,ordinat);
    super.setAnimalNature(true,false,false);
    super.setTamed(true);
    Consumption.addVegetableAmount(weight * 0.3);
  }

  /**  @see animal.Animal#interact().
   */

  @Override
  public void interact() {
    System.out.println("Koala imut sekali");
  }
  /**  @see animal.Mammal#mammalInteract().
   */

  @Override
  public void mammalInteract() {
    System.out.println("I'm a Koala and I'm a mammal");
  }
}


