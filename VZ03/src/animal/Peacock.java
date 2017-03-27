/**
 * Peacock merupakan kelas riil turunan Animal<br>
 * Merupakan hewan buas dan nature-nya di darat<br> 
 */
package animal;

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */
public class Peacock extends Animal implements Aves {

  /** Konstruktor kelas Animal<br>
   * I.S. sembarang<br>
   * F.S. animalNature diinisiasi menjadi land, tamed diisi true, jumlah sayuran bertambah<br>
   * @param weight Berat badan Peacock
   * @param absis Absis dari Peacock
   * @param ordinat Ordinat dari Peacock
   */
  public Peacock(int weight, int absis, int ordinat) {
    super(weight, absis, ordinat);
    super.setAnimalNature(true,false,false);
  	super.setTamed(true);
  	Consumption.addVegetableAmount(weight * 0.25);
  }

  /* 
   * @see animal.Aves#avesInteract()
   */
  @Override
  public void avesInteract() {
    System.out.println("I'm Peacock and I'm aves");
  }

  /* 
   * @see animal.Animal#interact()
   */
  @Override
  public void interact() {
    System.out.println("*Burung merak memamerkan sayapnya, sombong sekali :(*");
  }

}
