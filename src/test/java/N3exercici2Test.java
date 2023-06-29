import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import n3exercici2.N3exercici2;

public class N3exercici2Test {
	
	@Test
	public void esIgualTest() {

		Integer sencer1 = 12;
		Integer sencer2 = sencer1;
		assertThat(N3exercici2.referenciaEsIgual(sencer1, sencer2)).isEqualTo(true);

	}

}
