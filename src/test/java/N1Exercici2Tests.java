
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import n1exercici2.CalculoDni;

public class N1Exercici2Tests {

	private CalculoDni calculoDni = new CalculoDni();

	@Test
	public void testlletraDNI53625645H() {
		assertEquals('H', calculoDni.lletraDNI(53625645));
	}

	@Test
	public void testlletraDNI63523485S() {
		assertEquals('S', calculoDni.lletraDNI(63523485));
	}

	@Test
	public void testlletraDNI84126718D() {
		assertEquals('D', calculoDni.lletraDNI(84126718));
	}

	@Test
	public void testlletraDNI35621485M() {
		assertEquals('M', calculoDni.lletraDNI(35621485));
	}

	@Test
	public void testlletraDNI35648715A() {
		assertEquals('A', calculoDni.lletraDNI(35648715));
	}

	@Test
	public void testlletraDNI42361598Z() {
		assertEquals('Z', calculoDni.lletraDNI(42361598));
	}

	@Test
	public void testlletraDNI35619485Y() {
		assertEquals('Y', calculoDni.lletraDNI(35619485));
	}

	@Test
	public void testlletraDNI52341645Q() {
		assertEquals('Q', calculoDni.lletraDNI(52341645));
	}

	@Test
	public void testlletraDNI65412843S() {
		assertEquals('S', calculoDni.lletraDNI(65412843));
	}

	@Test
	public void testlletraDNI35795145S() {
		assertEquals('S', calculoDni.lletraDNI(35795145));
	}

}
