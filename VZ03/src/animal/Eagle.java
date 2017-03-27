/**  Eagle merupakan kelas riil turunan Animal<br>
 * Bukan merupakan hewan buas dan nature-nya di udara<br> 
 */

package animal;

/** @author Muhamad Irfan Maulana (13515037).
 */

public class Eagle extends Animal implements Aves {

  /** Konstruktor kelas Animal<br>
   * I.S. sembarang<br>
   * F.S. animalNature diinisiasi menjadi air, tamed diisi false, jumlah daging bertambah<br>
   * @param weight Berat badan Eagle
   * @param absis Absis dari Eagle
   * @param ordinat Ordinat dari Eagle
   */
  public Eagle(int weight, int absis, int ordinat) {
    super(weight, absis, ordinat);
    super.setAnimalNature(false,false,true);
    super.setTamed(false);
    Consumption.addMeatAmount(weight * 0.25);
  }

  /* (non-Javadoc).
   * @see animal.Aves#avesInteract().
   */

  @Override
  public void avesInteract() {
    System.out.println("I'm Eagle and I'm aves");
  }

  /* (non-Javadoc).
   * @see animal.Animal#interact().
   */

  @Override
  public void interact() {
    System.out.println("*Tatapan burung elang kelihatan tajam sekali*");
  }

}
