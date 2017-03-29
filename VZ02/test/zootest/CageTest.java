/**  Test untuk kelas Cage.
 */

package zootest;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import zoo.Cage;

/** @author Martin Lutta Putra (13515121).
 */

public class CageTest {

  @Test
  public void test() {
    Cage cage = new Cage(5,5);
    assertEquals(5,cage.numberOfCell());
    assertEquals(5,cage.numberOfAnimal());
  }

}