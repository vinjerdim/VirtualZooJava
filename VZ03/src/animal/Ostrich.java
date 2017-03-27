/**  Ostrich merupakan kelas riil turunan Animal<br>
 * Merupakan hewan buas dan nature-nya di darat<br> 
 */

package animal;

/** @author Muhamad Irfan Maulana (13515037).
 */

public class Ostrich extends Animal implements Aves {

  /** Konstruktor kelas Animal<br>
   * I.S. sembarang<br>
   * F.S. animalNature diinisiasi menjadi land, tamed diisi true
   *      jumlah daging dan sayuran bertambah<br>
   * @param weight Berat badan Ostrich
   * @param absis Absis dari Ostrich 
   * @param ordinat Ordinat dari Ostrich
   */
  public Ostrich(int weight, int absis, int ordinat) {
    super(weight, absis, ordinat);
    super.setAnimalNature(true,false,false);
    super.setTamed(true);
    Consumption.addMeatAmount(weight * 0.25);
    Consumption.addVegetableAmount(weight * 0.25);
  }

  /* 
   * @see animal.Aves#avesInteract().
   */

  @Override
  public void avesInteract() {
    System.out.println("I'm Ostrich and I'm aves");
  }

  /* 
   * @see animal.Animal#interact().
   */

  @Override
  public void interact() {
    System.out.println("*Burung unta sedang mengubur kepalanya dalam tanah*");
  }

}
