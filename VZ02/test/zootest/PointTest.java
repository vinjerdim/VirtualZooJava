
package zootest;

import zoo.Point;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**  Test untuk kelas Point.
 */

/** @author Marvin Jerremy Budiman (13515076).
 */

public class PointTest {

  @Test
  public void test() {
    Point point = new Point(-1,5);
    assertEquals(-1,point.getAbsis());
    assertEquals(5,point.getOrdinat());
  }

}