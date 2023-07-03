package n3exrcici6;

import java.util.Arrays;
import java.util.List;

public class N3Exercici6 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("obj1", "onj2");
		System.out.println(getFromList(1,list)); 

	}
	
	public static String getFromList(int i,List<String> list) {
		String objecte = null;
		try {
			objecte= list.get(i);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		return objecte;
		
	}

}
