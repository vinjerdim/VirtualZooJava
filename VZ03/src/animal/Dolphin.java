/**  Dolphin merupakan kelas riil turunan Animal<br>
 * Merupakan hewan jinak dan nature-nya di air<br>
 */
package animal;


/** @author Patrick NH (13515040).
 *
 */
public class Dolphin extends Animal implements Mammal {

  /** Konstruktor kelas Animal<br>
  * I.S. sembarang<br>
  * F.S. habitat_status diinisiasi menjadi water, tamed diisi true, jumlah daging bertambah<br>
  * @param weight berat badan Dolphin
  * @param absis absis lokasi Doplhin
  * @param ordinat ordinat lokasi Dolphin
  */
  public Dolphin(int weight,int absis,int ordinat) {
    super(weight,absis,ordinat);
    super.setAnimalNature(false,true,false);
    super.setTamed(true);
    Consumption.addMeatAmount(weight * 0.3);
  }

  /**
  * @see animal.Animal#interact().
  */

  @Override
  public void interact() {
    System.out.println("Ikan lumba-lumba melakukan dolphin jump ");
  }

  /**
  * @see animal.Mammal#mammalInteract().
  */

  @Override
  public void mammalInteract() {
    System.out.println("I'm a Dolphin and I'm a mammal");
  }
}
