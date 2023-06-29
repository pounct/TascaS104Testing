import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.Test;

import n3exercici3.N3Exercici3;

public class N3Exercici3Test {
	
	@Test
	public void esIgualTest() {
		
		int[] ints = {1, 2, 3};
		
		ArrayList<Integer> array1 =  new ArrayList<Integer>();
		ArrayList<Integer> array2 =  new ArrayList<Integer>();		
		
		for (int index = 0; index < ints.length; index++)
	    {
			array1.add(ints[index]);
			array2.add(ints[index]);
	    }

		
		assertThat(N3Exercici3.arrayEsIgual(array1, array2)).isEqualTo(true);

	}

}
