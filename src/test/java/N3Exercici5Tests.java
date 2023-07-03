
import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import n3exercici5.N3Exercici5;
public class N3Exercici5Tests {
	@Test
	public void  conteUnaKeyTest() {
		Map<String, String> map = new HashMap<String, String>();
	    map.put("A", "32");
	    map.put("C", "34");
	    map.put("T", "53");
	    
	    String key = "C";
	    
	    assertThat(N3Exercici5.conteUnaKey(key, map)).isEqualTo(true);
	    
	    
	}

}
