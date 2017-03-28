/**  Cheetah merupakan kelas riil turunan Animal<br>
 * Merupakan hewan buas dan nature-nya di darat<br>
 */
package animal;

/** @author Patrick NH (13515040).
 */

public class Cheetah extends Animal implements Mammal {
  /** Konstruktor kelas Animal<br>
   * I.S. sembarang<br>
   * F.S. habitat_status diinisiasi menjadi land, tamed diisi false, jumlah daging bertambah<br>
   * @param weight berat badan Cheetah
   * @param absis absis lokasi Cheetah
   * @param ordinat ordinat lokasi Cheetah
   */
  public Cheetah(int weight,int absis,int ordinat) {
    super(weight,absis,ordinat);
    super.setAnimalNature(true,false,false);
    super.setTamed(false);
    Consumption.addMeatAmount(weight * 0.6);
  }

  /**  @see animal.Animal#interact().
   */

  @Override
  public void interact() {
    System.out.println("Cheetah tidur siang");
  }
  /**  @see animal.Mammal#mammalInteract().
   */

  @Override
  public void mammalInteract() {
    System.out.println("I'm a cheetah and I'm a mammal");
  }
}
