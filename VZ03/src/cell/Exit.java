/**
 * Exit menyatakan cell yang merupakana jalan keluar pada Zoo
 */
package cell;

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */
public class Exit extends Road {

	/**
	 * Konstruktor kelas Exit
	 * I.S. sembarang
	 * F.S. tercipta objek Exit
	 * @param absis Absis dari Exit
	 * @param ordinat Ordinat dari Exit
	 */
	public Exit(int absis, int ordinat) {
		super(absis, ordinat);
	}
	
	/**
	 * @see cell.Renderable#render()
	 */
	@Override
	public void render() {
		System.out.print("(");
	}

}
