/**
 * Orangutan merupakan kelas riil turunan Animal<br>
 * Merupakan hewan buas dan nature-nya di land<br> 
 */
package animal;

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */
public class Orangutan extends Animal implements Mammal {

	  /** Konstruktor kelas Animal<br>
	   * I.S. sembarang<br>
	   * F.S. animalNature diinisiasi menjadi land, tamed diisi true, jumlah daging dan sayuran bertambah<br>
	   * @param weight Berat badan Orangutan
	   * @param absis Absis dari Orangutan
	   * @param ordinat Ordinat dari Orangutan
	   */
	public Orangutan(int weight, int absis, int ordinat) {
	    super(weight, absis, ordinat);
	    super.setAnimalNature(true,false,false);
	  	super.setTamed(true);
	  	Consumption.addMeatAmount(weight * 0.25);
	  	Consumption.addVegetableAmount(weight * 0.25);
	}

	/* (non-Javadoc)
	 * @see animal.Mammal#mammalInteract()
	 */
	@Override
	public void mammalInteract() {
		System.out.println("I'm Orangutan and I'm mammal");
	}

	/* (non-Javadoc)
	 * @see animal.Animal#interact()
	 */
	@Override
	public void interact() {
		System.out.println("*Orangutan bergelayutan*");
	}

}
