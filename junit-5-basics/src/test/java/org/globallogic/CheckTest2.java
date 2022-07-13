package org.globallogic;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckTest2 {

	@Test
	public void test() {
		Check check=new Check();
		String expected="Odd";
		String actual=check.evenodd(5);
		assertEquals(expected, actual);
	}

}
