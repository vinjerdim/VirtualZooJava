/**
 * Park menyatakan park pada Zoo
 */
package cell;

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */
public class Park extends Facility implements Renderable {

	/**
	 * Konstruktor kelas Park
	 * I.S. sembarang
	 * F.S. tercipta objek Park
	 * @param absis Absis dari Park
	 * @param ordinat Ordinat dari Park
	 */
	public Park(int absis, int ordinat) {
		super(absis, ordinat);
	}

	/**
	 * @see cell.Renderable#render()
	 */
	@Override
	public void render() {
		System.out.print("^");
	}

}
