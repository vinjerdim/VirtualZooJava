/**
 *
 */
package zootest;

import org.junit.Test;

import org.junit.Rule;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import zoo.Driver;

/** @author Martin Lutta Putra (13515121).
 *
 *
 */
public class DriverTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void test() {
		Driver driver = new Driver("FakeZoo.txt");
		assertEquals()
	}

}
