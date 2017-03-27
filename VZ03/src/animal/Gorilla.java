

package animal;

/** @author Patrick NH (13515040).
 */

public class Gorilla  extends Animal implements Mammal {
  /** Konstruktor kelas Animal<br>
   * I.S. sembarang<br>
   * F.S. habitat_status diinisiasi menjadi land, tamed diisi false, jumlah daging bertambah<br>
   * @param weight berat badan Gorilla
   * @param absis absis lokasi Gorilla
   * @param ordinat ordinat lokasi Gorilla
   */
  public Gorilla(int weight,int absis,int ordinat) {
    super(weight,absis,ordinat);
    super.setAnimalNature(true,false,false);
    super.setTamed(false);
    Consumption.addMeatAmount(weight * 0.4);
  }
  
  /**  @see animal.Animal#interact().
   */

  @Override
  public void interact() {
    System.out.println("Gorilla menggedor kandang dan berusaha menerkam kamu");
  }
  /**  @see animal.Mammal#mammalInteract().
   */

  @Override
  public void mammalInteract() {
    System.out.println("I'm a gorilla and I'm a mammal");
  }
}

