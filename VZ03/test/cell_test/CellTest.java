/**  Test untuk kelas Cell
 */

package cell_test;

import static org.junit.Assert.*;

import org.junit.Test;

import cell.Cell;

/** @author Marvin Jerremy Budiman (13515076).
 */

public class CellTest {

  @Test
  public void test() {
    Cell cell = new Cell(1,-5);
    assertEquals(1,cell.getCellAbsis());
    assertEquals(-5,cell.getCellAbsis());
  }
}
