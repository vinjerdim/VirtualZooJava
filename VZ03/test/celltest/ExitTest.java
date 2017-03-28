

package celltest;

import cell.Exit;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/** @author Muhamad Irfan Maulana (13515037).
 */

public class ExitTest {

  @Test
  public void test() {
    Exit exit = new Exit(1,2);
    assertEquals(1,exit.getCellAbsis());
    assertEquals(2,exit.getCellOrdinat());
  }

}
