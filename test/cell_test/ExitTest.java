/**
 * 
 */
package cell_test;

import static org.junit.Assert.*;
import org.junit.Test;
import cell.Exit;

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */
public class ExitTest {

	@Test
	public void test() {
		Exit exit = new Exit(1,2);
		assertEquals(1,exit.getCellAbsis());
		assertEquals(2,exit.getCellOrdinat());
	}

}
