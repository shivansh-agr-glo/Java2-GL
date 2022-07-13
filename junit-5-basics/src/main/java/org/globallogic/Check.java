package org.globallogic;

import org.junit.Test;

public class Check {
	
	@Test
	public String evenodd(int num) {
		
		if(num%2==0) {
			return "Even";
		}else {
			return "Odd";
		}
	}

}
