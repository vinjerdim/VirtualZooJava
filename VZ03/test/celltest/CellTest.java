/**  Test untuk kelas Cell.
 */

package celltest;

import cell.Cell;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


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
