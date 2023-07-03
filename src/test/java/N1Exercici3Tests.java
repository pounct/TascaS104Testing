

import org.junit.Test;

public class N1Exercici3Tests {
	
	@Test(expected = ArrayIndexOutOfBoundsException.class) 
	public void testthrowsArrayIndexException() {
	  int [] array = new int[] {};
	  System.out.println(array[1]);
	}
}
