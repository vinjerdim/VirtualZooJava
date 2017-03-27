/**
 * 
 */
package cell;

/**
 * @author Patrick NH (13515040)
 *
 */
public class Restaurant extends Facility implements Renderable {

	/**
	 * @param absis Absis dari Restaurant
	 * @param ordinat Ordinat dari Restaurant
	 */
	public Restaurant(int absis, int ordinat) {
		super(absis, ordinat);
	}
	
	@Override
	public void render() {
		System.out.println("$");		
	}

}
