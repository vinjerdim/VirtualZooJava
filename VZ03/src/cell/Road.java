/**
 * Road merupakan cell berupa jalan pada Zoo
 */
package cell;

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */
public class Road extends Facility implements Renderable {
	
  private boolean isVisited;
	
  /** Konstruktor kelas Road
    * I.S. sembarang
	* F.S. tercipta objek Road, isVisited dan isVisitorHere
	* @param absis Absis dari Road
	* @param ordinat Ordinat dari Road
	*/
  public Road(int absis, int ordinat) {
	super(absis, ordinat);
	isVisited = false;
  }

  /**
	* @see cell.Renderable#render()
	*/
  @Override
  public void render() {
	if (isVisited) {
	  System.out.print("-");
	} else {
	  System.out.print(" ");
	}
  }
	
  /** I.S. sembarang
	* F.S. sama dengan F.S.
	*/
  public boolean isVisited() {
	return isVisited;
  }
	
  /** I.S. sembarang
	* F.S. isVisited terisi dengan suatu nilai 
	* @param s bernilai true jika Road sudah dikunjungi
	*/
  public void setVisited(boolean s) {
	isVisited = s;
  }
}
