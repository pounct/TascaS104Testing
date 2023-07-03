
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;



import n1exercici1.N1Exercici1;

public class N1Exercici1Tests {
	
	@Test
	public void  testLlistaTe12Posicions() {

		ArrayList<String> months = N1Exercici1.monthsDelAny();

		assertEquals(12, months.size());
		
	}
	@Test
	public void  testLlistaNoEsNull() {

		ArrayList<String> months = N1Exercici1.monthsDelAny();

		assertNotNull(months);
	}
	@Test
	public void  testPosicio8ConteAgost() {

		ArrayList<String> months = N1Exercici1.monthsDelAny();
		int indexPosicion8 = 7;
		
		assertEquals("Agost", months.get(indexPosicion8));
	}

}
