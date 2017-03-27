/**
 * 
 */
package cell;

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */
public class Entrance extends Road {

	/**
	 * @param absis Absis dari Entrance
	 * @param ordinat Ordinat dari Entrance
	 */
	public Entrance(int absis, int ordinat) {
		super(absis, ordinat);
	}

	@Override
	public void render() {
		System.out.print(")");
	}
}
