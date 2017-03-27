/**
 * 
 */
package cell;

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */
public class Road extends Facility implements Renderable {
	
	private boolean visited;
	private boolean is_here;
	
	/**
	 * @param absis Absis dari Road
	 * @param ordinat Ordinat dari Road
	 */
	public Road(int absis, int ordinat) {
		super(absis, ordinat);
		visited = false;
		is_here = false;
	}

	/* (non-Javadoc)
	 * @see cell.Renderable#render()
	 */
	@Override
	public void render() {
	  if (visited) {
	    System.out.print("-");
	  } 
	  else {
	    if (!is_here) {
		  System.out.print(" ");
		} 
	    else {
		  System.out.print("@");
		}
	  }
	}
	
	/** Method yang mengembalikan boolean sudah dilewati atau belum
	 */
	public boolean isVisited() {
		return visited;
	}
	
	/** Method untuk men-set nilai visited
	 *  @param s Boolean yang akan di set ke atribut visited
	 */
	public void setVisited(boolean s) {
		visited = s;
	}
	
	/** Method untuk men-set nilai is_here
	 *  @param s Boolean yang akan di set ke atribut is_here
	 */
	public void setIsHere(boolean s) {
		is_here = s;
	}
	

}
