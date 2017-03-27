/**
 * Komodo merupakan kelas riil turunan Animal<br>
 * Merupakan hewan buas dan nature-nya di darat<br>
 */
package animal;

/**
 * @author Martin Lutta Putra (13515121)  
 *
 */
public class Komodo extends Animal implements Reptile {

  /**
   *
   * Konstruktor kelas Animal<br>
   * I.S. sembarang<br>
   * F.S. habitat_status diinisiasi menjadi land, tamed diisi false, jumlah daging bertambah <br>
   * 
   * @param weight
   * @param absis
   * @param ordinat
   */
  public Komodo(int weight, int absis, int ordinat) {
    super(weight, absis, ordinat);
    super.setAnimalNature(true, false, false);
    super.setTamed(false);
    Consumption.addMeatAmount(weight * 0.25);
  }

  /* (non-Javadoc)
   * @see animal.Reptile#reptileInteract()
   */
  @Override
  public void reptileInteract() {
    System.out.println("Komodo");
  }

  /* (non-Javadoc)
   * @see animal.Animal#interact()
   */
  @Override
  public void interact() {
	System.out.println("Saya komodo makan sabun");
  }

}
