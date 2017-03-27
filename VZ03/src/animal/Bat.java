/**  Bat merupakan kelas riil turunan Animal<br>
 * Merupakan hewan buas dan nature-nya di udara<br>
 */

package animal;

/** @author Muhamad Irfan Maulana (13515037).
 */

public class Bat extends Animal implements Mammal {

  /** Konstruktor kelas Animal<br>
  * I.S. sembarang<br>
  * F.S. animalNature diinisiasi menjadi air, tamed diisi true, jumlah daging bertambah<br>
  * @param weight Berat badan Bat
  * @param absis Absis dari Bat
  * @param ordinat Ordinat dari Bat
  */
  public Bat(int weight, int absis, int ordinat) {
    super(weight, absis, ordinat);
    super.setAnimalNature(false,false,true);
    super.setTamed(true);
    Consumption.addMeatAmount(weight * 0.25);
  }

  /* (non-Javadoc).S
   * @see animal.Mammal#mammalInteract().
   */

  @Override
  public void mammalInteract() {
    System.out.println("I'm Bat and I'm mammal");
  }

  /* (non-Javadoc).
   * @see animal.Animal#interact().
   */

  @Override
  public void interact() {
    System.out.println("*Kelelawar bergelantung terbalik*");
  }

}
