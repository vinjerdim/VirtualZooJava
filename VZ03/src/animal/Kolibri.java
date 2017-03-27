/**  Kolibri merupakan kelas riil turunan Animal<br>
 * Merupakan hewan buas dan nature-nya di udara<br>
 */

package animal;

/** @author Muhamad Irfan Maulana (13515037).
 */

public class Kolibri extends Animal implements Aves {

  /** Konstruktor kelas Animal<br>
   * I.S. sembarang<br>
   * F.S. animalNature diinisiasi menjadi air, tamed diisi true
   *      jumlah daging dan sayuran bertambah<br>
   * @param weight Berat badan Kolibri
   * @param absis Absis dari Kolibri
   * @param ordinat Ordinat dari Kolibri
   */
  public Kolibri(int weight, int absis, int ordinat) {
    super(weight, absis, ordinat);
    super.setAnimalNature(false,false,true);
    super.setTamed(true);
    Consumption.addMeatAmount(weight * 0.25);
    Consumption.addVegetableAmount(weight * 0.25);
  }

  /* (non-Javadoc).
   * @see animal.Aves#avesInteract().
   */

  @Override
  public void avesInteract() {
    System.out.println("I'm Kolibri and I'm aves");
  }

  /* (non-Javadoc).
   * @see animal.Animal#interact().
   */

  @Override
  public void interact() {
    System.out.println("*Paruh kolibri sangat panjang, kerenn *");
  }

}
