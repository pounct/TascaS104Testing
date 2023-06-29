import org.junit.Test;

import n3exercici1.N3Exercici1;

import static org.assertj.core.api.Assertions.*;

public class N3Exercici1Test {	

	@Test
	public void esIgualTest() {
		Integer sencer1 = 12;
		Integer sencer2 = 12;
		assertThat(N3Exercici1.esIgual(sencer1, sencer2)).isEqualTo(true);

	}

}
