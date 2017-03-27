/**  Whale merupakan kelas riil turunan Animal<br>
 * Merupakan hewan buas dan nature-nya di water<br>
 */

package animal;

/** @author Muhamad Irfan Maulana (13515037).
 */

public class Whale extends Animal implements Mammal {

  /** Konstruktor kelas Animal<br>
  * I.S. sembarang<br>
  * F.S. animalNature diinisiasi menjadi water, tamed diisi true, jumlah daging bertambah<br>
  * @param weight Berat badan Whale
  * @param absis Absis dari Whale
  * @param ordinat Ordinat dari Whale
  */
  public Whale(int weight, int absis, int ordinat) {
    super(weight, absis, ordinat);
    super.setAnimalNature(false,true,false);
    super.setTamed(true);
    Consumption.addMeatAmount(weight * 0.25);
  }

  /* (non-Javadoc).
   * @see animal.Mammal#mammalInteract().
   */

  @Override
  public void mammalInteract() {
    System.out.println("I'm Whale and I'm mammal");
  }

  /* (non-Javadoc).
   * @see animal.Animal#interact().
   */

  @Override
  public void interact() {
    System.out.println("*Ikan paus hampir tidak muat di habitatnya*");
  }

}
