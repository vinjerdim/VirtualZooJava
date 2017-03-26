/**
 * Animal merupakan template untuk menciptakan hewan
 */
package animal;

/**
 * @author Marvin Jerremy Budiman (13515076)
 *
 */
public abstract class Animal {
  private int weight;
	  
  /** tamed bernilai true jika hewan jinak, false jika buas
    */
  private boolean tamed;

  private Nature animalNature;

  /** Konstruktor kelas Animal<br>
    * I.S. sembarang<br>
    * F.S. weight berisi suatu nilai, habitat_status tercipta<br>
    * @param weight berat badan hewan<br>
    */
  public Animal(int weight) {
  	this.weight = weight;
  	animalNature = new Nature();
  }

  /** I.S. sembarang<br>
    * F.S. tamed berisi suatu nilai<br>
    * @param tamed buas tidaknya suatu hewan<br>
    */
  public void setTamed(boolean tamed) {
  	this.tamed = tamed;
  }

  /** I.S. sembarang<br>
    * F.S. sama dengan I.S.<br>
    * @return mengembalikan buas atau tidaknya suatu hewan<br>
    */
  public boolean getTamed() {
  	return tamed;
  }

  /** I.S. sembarang<br>
    * F.S. sama dengan I.S.<br>
    * @return mengembalikan berat suatu hewan<br>
    */
  public int getWeight() {
    return weight;
  }

  /** I.S. sembarang<br>
    * F.S. habitat_status terisi suatu nilai<br>
    * @param land bernilai true jika hewan darat<br>
    * @param water bernilai true jika hewan air<br>
    * @param air bernilai true jika hewan terbang<br>
    */
  public void setAnimalNature(boolean land, boolean water, boolean air) {
  	if (land) {
  	  animalNature.setNatureToLand();
  	}
  	if (water) {
  	  animalNature.setNatureToWater();
  	}
  	if (air) {
  	  animalNature.setNatureToAir();
  	}
  }

  /** I.S. sembarang<br>
    * F.S. sama dengan I.S.<br>
    * @return memberi akses terhadap habitat_status<br>
    */
  public Nature getHabitatStatus() {
  	return animalNature;
  }

  /** Method abstrak yang diimplementasi di semua turunan Animal<br>
    * I.S. sembarang<br>
    * F.S. di layar tercetak bentuk interaksi hewan<br>
    */
  public abstract void interact();
}
