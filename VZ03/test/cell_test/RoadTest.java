

package cell_test;

import cell.Road;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/** @author Muhamad Irfan Maulana (13515037).
 */

public class RoadTest {
  @Test
  public void test() {
    Road road = new Road(1,2);
    assertEquals(1,road.getCellAbsis());
    assertEquals(2,road.getCellOrdinat());

    road.setVisited(true);
    assertTrue(road.isVisited());
    road.setVisited(false);
    assertFalse(road.isVisited());
  }
}
