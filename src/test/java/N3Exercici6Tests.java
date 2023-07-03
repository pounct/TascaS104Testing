import static org.assertj.core.api.Assertions.assertThatIndexOutOfBoundsException;

import java.util.Arrays;
import org.junit.Test;

public class N3Exercici6Tests {
	
	@Test
	public void testProvocaUnaArrayIndexOutOfBoundsException() {		
				
		assertThatIndexOutOfBoundsException()
		.isThrownBy(() -> Arrays.asList("obj1", "onj2").get(2))
		.withMessage("Index 2 out of bounds for length 2");		  
	}

}
