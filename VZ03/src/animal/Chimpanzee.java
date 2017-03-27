/**
 * 
 */
package animal;

/**
 * @author Patrick NH (13515040)
 *
 */
public class Chimpanzee extends Animal implements Mammal {
  /** Konstruktor kelas Animal<br>
   * I.S. sembarang<br>
   * F.S. habitat_status diinisiasi menjadi land, tamed diisi false, jumlah daging bertambah<br>
   * @param weight berat badan Chimpanzee
   * @param absis absis lokasi Chimpanzee
   * @param ordinat ordinat lokasi Chimpanzee
   */
  public Chimpanzee(int weight,int absis,int ordinat){
  	super(weight,absis,ordinat);
  	super.setAnimalNature(true,false,false);
  	super.setTamed(true);
  	Consumption.addMeatAmount(weight * 0.3);
  }
  
  /**
   * @see animal.Animal#interact()
   */
  @Override
  public void interact() {
    System.out.println("Chimpanzee garuk-garuk punggung");
  }
  /**
   * @see animal.Mammal#mammalInteract()
   */
  @Override
  public void mammalInteract() {
    System.out.println("I'm a chimpanzee and I'm a mammal");
  }
}

