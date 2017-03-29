/**  Test untuk kelas Cell.
 */

package celltest;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import cell.Cell;

import org.junit.Test;



/** @author Martin Lutta Putra (13515076).
 */

public class CellTest {

  @Test
  public void test() {
    Cell cell = new Cell(1,5);
    assertEquals(1,cell.getCellAbsis());
    assertEquals(5,cell.getCellOrdinat());
    boolean[] tipeSel = new boolean[11];
    for (int i = 0; i < 11; i++) {
      tipeSel[i] = false;
    }
    assertArrayEquals(tipeSel, cell.getCellType());
    assertFalse(cell.getTamed());
    assertEquals(cell.getAnimalChar(),' ');
  }
}
