/**
 * Cell merupakan abstract class untuk semua jenis cell
 */
package cell;
import util.Point;
/**
 * @author vinjerdim
 *
 */
public class Cell implements Renderable {
  private Point coordinate;
  /* (non-Javadoc)
   * @see cell.Renderable#render()
   */
  @Override
  public void render() {
	System.out.println("");	
  }
}
