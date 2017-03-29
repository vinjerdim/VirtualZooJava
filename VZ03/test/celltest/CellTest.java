/**  Test untuk kelas Cell.
 */

package celltest;

import static org.junit.Assert.assertEquals;

import cell.Cell;

import org.junit.Test;




/** @author Marvin Jerremy Budiman (13515076).
 */

public class CellTest {

  @Test
  public void test() {
    Cell cell = new Cell(1,2);
    assertEquals(1,cell.getCellAbsis());
    assertEquals(2,cell.getCellOrdinat());
  }
}
