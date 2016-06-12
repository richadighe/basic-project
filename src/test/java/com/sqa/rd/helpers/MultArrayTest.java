/**
 *   File Name: MultArrayTest.java<br>
 *
 *   Dighe, Richa<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Richa Dighe<br>
 *   Created: Jun 1, 2016
 *   
 */

package com.sqa.rd.helpers;

import org.junit.*;

public class MultArrayTest {

	@Test
	public void test() {
		Object[][] arrayData = MultArray.getData();
		DisplayHelper.multArray(arrayData);
	}
}
