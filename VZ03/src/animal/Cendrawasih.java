/**
 * Cendrawasih merupakan kelas riil turunan Animal<br>
 * Merupakan hewan buas dan nature-nya di udara<br> 
 */
package animal;

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */
public class Cendrawasih extends Animal implements Aves {

  /** Konstruktor kelas Animal<br>
   * I.S. sembarang<br>
   * F.S. animalNature diinisiasi menjadi air, tamed diisi true, jumlah daging dan sayuran bertambah<br>
   * @param weight Berat badan Cendrawasih
   * @param absis Absis dari Cendrawasih
   * @param ordinat Ordinat dari Cendrawasih
   */
  public Cendrawasih(int weight, int absis, int ordinat) {
    super(weight, absis, ordinat);
    super.setAnimalNature(false,false,true);
  	super.setTamed(true);
  	Consumption.addMeatAmount(weight * 0.25);
  	Consumption.addVegetableAmount(weight * 0.25);
  }

  /* (non-Javadoc)
   * @see animal.Aves#avesInteract()
   */
  @Override
  public void avesInteract() {
    System.out.println("I'm Cendrawasih and I'm aves");
  }

  /* (non-Javadoc)
   * @see animal.Animal#interact()
   */
  @Override
  public void interact() {
    System.out.println("*Burung cendrawasih sangat indah, tidak heran kalau mereka terancam punah .__. *");
  }

}
