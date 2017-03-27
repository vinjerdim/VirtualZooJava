/**
 * Crocodile merupakan kelas riil turunan Animal<br>
 * Merupakan hewan buas dan nature-nya di air<br> 
 */

package animal;

/**
 * @author Martin Lutta Putra (13515121)	
 *
 */
public class Crocodile extends Animal implements Reptile {

	/**
	 * Konstruktor kelas Animal<br>
     * I.S. sembarang<br>
   	 * F.S. habitat_status diinisiasi menjadi water, tamed diisi false, jumlah daging bertambah<br>
   	 * 
	 * @param weight
	 * @param absis
	 * @param ordinat
	 */
	public Crocodile(int weight, int absis, int ordinat) {
		super(weight, absis, ordinat);
	    super.setAnimalNature(false, true, false);
	    super.setTamed(false);
	    Consumption.addMeatAmount(weight * 0.25);
	}

	/* (non-Javadoc)
	 * @see animal.Reptile#reptileInteract()
	 */
	@Override
	public void reptileInteract() {
		System.out.println("Saya hewan reptil yeay ");
	}

	/* (non-Javadoc)
	 * @see animal.Animal#interact()
	 */
	@Override
	public void interact() {
		System.out.println("Saya galak lho .__.");
	}

}
