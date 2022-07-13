package unitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTestingImpl {
	
	@Test
	public void add_two_nums(){
		final int expected=4;
		final int actual=Math.addExact(2,2);
		//Test method to perforn unit test
		assertEquals(actual,expected);
		
	}
	
	
	@Test
	public void mult_two_nums() {
		int expected=20;
		int actual=Math.multiplyExact(4, 5);
		assertEquals(expected, actual);
	}
	

	public static void main(String[] args) {
		System.out.println("Single unit implemented");

	}

}
