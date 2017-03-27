/**
 * 
 */
package cell;

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */
public class Park extends Facility implements Renderable {

	/**
	 * @param absis Absis dari Park
	 * @param ordinat Ordinat dari Park
	 */
	public Park(int absis, int ordinat) {
		super(absis, ordinat);
	}

	/* (non-Javadoc)
	 * @see cell.Renderable#render()
	 */
	@Override
	public void render() {
		System.out.print("^");
	}

}
