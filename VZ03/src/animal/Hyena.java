package animal;

/** @author Patrick NH (13515040).
 */

public class Hyena extends Animal implements Mammal {
  /** Konstruktor kelas Animal<br>
   * I.S. sembarang<br>
   * F.S. habitat_status diinisiasi menjadi land, tamed diisi false, jumlah daging bertambah<br>
   * @param weight berat badan Hyena
   * @param absis absis lokasi Hyena
   * @param ordinat ordinat lokasi Hyena
   */
  public Hyena(int weight,int absis,int ordinat) {
    super(weight,absis,ordinat);
    super.setAnimalNature(true,false,false);
    super.setTamed(false);
    Consumption.addMeatAmount(weight * 0.3);
  }

  /**  @see animal.Animal#interact().
   */

  @Override
  public void interact() {
    System.out.println("Hyena berjalan-jalan mengelilingi kandang");
  }
  /**  @see animal.Mammal#mammalInteract().
   */

  @Override
  public void mammalInteract() {
    System.out.println("I'm a hyena and I'm a mammal");
  }
}
