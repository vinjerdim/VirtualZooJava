/**
 * Mantaray merupakan kelas riil turunan Animal<br>
 * Merupakan hewan jinak dan nature-nya di air<br> 
 */
package animal;

/**
 * @author Martin Lutta Putra (13515121)	
 *
 */
public class Mantaray extends Animal implements Pisces {

	/**
	 * Konstruktor kelas Animal<br>
     * I.S. sembarang<br>
     * F.S. habitat_status diinisiasi menjadi water, tamed diisi true, jumlah daging bertambah<br>
	 * 
	 * @param weight
	 * @param absis
	 * @param ordinat
	 */
	public Mantaray(int weight, int absis, int ordinat) {
		super(weight, absis, ordinat);
	  	super.setAnimalNature(false,true,false);
	  	super.setTamed(true);
	  	Consumption.addMeatAmount(weight * 0.25);
	}

	/* (non-Javadoc)
	 * @see animal.Pisces#piscesInteract()
	 */
	@Override
	public void piscesInteract() {
		System.out.println("Aku termasuk ikan lho");
	}

	/* (non-Javadoc)
	 * @see animal.Animal#interact()
	 */
	@Override
	public void interact() {
		System.out.println("Saya beracun ~");
	}

}
