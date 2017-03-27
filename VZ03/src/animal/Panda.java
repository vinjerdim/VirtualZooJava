/**  Panda merupakan kelas riil turunan Animal<br>
 * Merupakan hewan jinak dan nature-nya di darat<br> 
 */

package animal;

/** @author Martin Lutta Putra (13515121).  
 */

public class Panda extends Animal implements Mammal {

  /**  Konstruktor kelas Animal<br>
  * I.S. sembarang<br>
   * F.S. habitat_status diinisiasi menjadi land, tamed diisi true, sayur bertambah <br>
   * @param weight
   * @param absis
   * @param ordinat
   */
  public Panda(int weight, int absis, int ordinat) {
    super(weight, absis, ordinat);
    super.setAnimalNature(true, false, false);
    super.setTamed(true);
    Consumption.addVegetableAmount(weight * 0.25);
  }

  /* (non-Javadoc).
   * @see animal.Mammal#mammalInteract().
   */

  @Override
  public void mammalInteract() {
    System.out.println("Aku mamalia yang imut hehehe");
  }

  /* (non-Javadoc).
   * @see animal.Animal#interact().
   */

  @Override
  public void interact() {
    System.out.println("Aku unyu sekali yeay");
  }

}
