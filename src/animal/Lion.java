/**
 * Lion merupakan kelas riil turunan Animal<br>
 * Merupakan hewan buas dan nature-nya di darat<br>
 */
package animal;

/**
 * @author Marvin Jerremy Budiman (13515076)
 *
 */
public class Lion extends Animal implements Mammal {
  /** Konstruktor kelas Animal<br>
   * I.S. sembarang<br>
   * F.S. habitat_status diinisiasi menjadi land, tamed diisi false, jumlah daging bertambah<br>
   * @param weight berat badan Lion
   */
  public Lion(int weight,int absis,int ordinat){
  	super(weight,absis,ordinat);
  	super.setAnimalNature(true,false,false);
  	super.setTamed(false);
  	Consumption.addMeatAmount(weight * 0.25);
  }
  
  /**
   * @see animal.Animal#interact()
   */
  @Override
  public void interact() {
    System.out.println("HEHE");
  }
  /**
   * @see animal.Mammal#mammalInteract()
   */
  @Override
  public void mammalInteract() {
    System.out.println("I'm a lion and I'm a mammal");
  }
}
