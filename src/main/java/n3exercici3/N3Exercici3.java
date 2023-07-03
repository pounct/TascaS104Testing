package n3exercici3;

import java.util.ArrayList;

public class N3Exercici3 {
	
	public static Boolean arrayEsIgual(ArrayList<Integer> array1, ArrayList<Integer> array2) {
		
		if (array1.size()==array2.size()) {
			int i=0;
			for (Integer num:array1) {
				if (!num.equals(array2.get(i))) {
					return false;
				}
				i++;
			}
		}
		else {
			return false;
		}

		return true;

	}

	public static void main(String[] args) {
		
	}

}
