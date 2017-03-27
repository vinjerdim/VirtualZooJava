/**
 * Entrance menyatakan cell yang merupakana jalan masuk pada Zoo
 */
package cell;

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */
public class Entrance extends Road {

	/**
	 * Konstruktor kelas Entrance
	 * I.S. sembarang
	 * F.S. tercipta objek Entrance
	 * @param absis Absis dari Entrance
	 * @param ordinat Ordinat dari Entrance
	 */
	public Entrance(int absis, int ordinat) {
		super(absis, ordinat);
	}
	
	/**
	 * @see cell.Renderable#render()
	 */
	@Override
	public void render() {
		System.out.print(")");
	}
}
