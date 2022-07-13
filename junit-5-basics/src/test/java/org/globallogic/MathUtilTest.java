 package org.globallogic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class MathUtilTest {
	
	//Wrapper Object
	MathUtil mathutil;
	
	//initialize object for the class
	@BeforeEach
	public void init() {
		mathutil=new MathUtil();
	}
	
	@AfterEach
	public void cleanup() {
		System.out.println("fun");
	}

	@Test
	public void test() {
		MathUtil mathutil=new MathUtil();
		int expected=20;
		int actual=mathutil.add_nums(10, 10);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testdivide() {
		MathUtil mathutil=new MathUtil();
		assertThrows(ArithmeticException.class, ()->mathutil.div(10, 0));
	}
	
	@Test
	public void testsub() {
		MathUtil mathutil=new MathUtil();
		int expected=5;
		int actual=mathutil.sub(10, 5);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testmul() {
		MathUtil mathutil=new MathUtil();
		int expected=100;
		int actual=mathutil.mul(10, 10);
		assertEquals(expected,actual);
	}

}

