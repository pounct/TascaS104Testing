import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.hamcrest.core.Is;

import org.junit.Test; 
public class N2Exercici1Tests {
	
	public static  Matcher<String> hasLength(Matcher<Integer> matcher) {
	    return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "length") {
	        @Override
	        protected Integer featureValueOf(String actual) {
	          return actual.length();
	        }
	    };
	}
	
	@Test
	public void cadenaAComprobarLongitud8() {
	    assertThat("Mordor", hasLength(Is.is(8)));
	}
	
	@Test
	public void cadenaAComprobarLongitud6() {
	    assertThat("Mordor", hasLength(Is.is(6)));
	}

}
