/**
 * 
 */
package cell;

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */
public class Exit extends Road {

	/**
	 * @param absis Absis dari Exit
	 * @param ordinat Absis dari Ordinat
	 */
	public Exit(int absis, int ordinat) {
		super(absis, ordinat);
	}
	
	@Override
	public void render() {
		System.out.print("(");
	}

}
