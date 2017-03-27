/**  Frog merupakan kelas riil turunan Animal<br>
 * Merupakan hewan tidak buas dan nature-nya di darat dan air (amphibi) <br>
 */

package animal;

/** @author Martin Lutta Putra (13515121).
 */

public class Frog extends Animal implements Amphibi {

  /**  Konstruktor kelas Animal<br>
   * I.S. sembarang<br>
   * F.S. habitat_status diinisiasi menjadi land dan water, tamed diisi true,
   *     jumlah daging dan sayur bertambah <br>
   * @param weight
   * @param absis
   * @param ordinat
   */
  public Frog(int weight, int absis, int ordinat) {
    super(weight, absis, ordinat);
    super.setAnimalNature(true, true, false);
    super.setTamed(true);
    Consumption.addMeatAmount(weight * 0.125);
    Consumption.addVegetableAmount(weight * 0.125);
  }

  /* (non-Javadoc).
   * @see animal.Amphibi#amphibiInteract().
   */

  @Override
  public void amphibiInteract() {
    System.out.println("Saya hewan amphibi yeay");
  }

  /* (non-Javadoc).
   * @see animal.Animal#interact().
   */

  @Override
  public void interact() {
    System.out.println("*Webek webek*");
  }

}
