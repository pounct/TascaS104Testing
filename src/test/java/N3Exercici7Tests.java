

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.Test;

public class N3Exercici7Tests {
	
	@Test
	public void testOpcionalObjectBuit() {
		
		Optional<String> optional = Optional.empty();
		
		assertThat(optional).isEmpty(); // pass
		
	}

}
