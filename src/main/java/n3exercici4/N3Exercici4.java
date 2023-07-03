package n3exercici4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class N3Exercici4 {

	public static void main(String[] args) {
		Object[] arraySegonsInserits = new Object[] { "stringObjecte", 14, new Book(12, "titulo1", "edicion1"), 1800L,
				1.99F };
		ArrayList<Object> arrayObjectes = new ArrayList<Object>();

		arrayObjectes.add("stringObjecte");

		arrayObjectes.add(14);

		arrayObjectes.add(new Book(12, "titulo1", "edicion1"));

		arrayObjectes.add(1800L);

		arrayObjectes.add(1.99F);

		System.out.println("ArrayList after all insertions: ");

		display(arrayObjectes, arraySegonsInserits);
		Set<Object> uniqueObjectesSet = new HashSet<Object>(arrayObjectes);
		display2(uniqueObjectesSet, arraySegonsInserits);

		System.out.println(orderArraySegonsInserits(arrayObjectes, arraySegonsInserits));
		System.out.println(objecteAfegitUnaVegada("stringObjecte", arrayObjectes));

	}

	public static void display(ArrayList<Object> arrayObjectes, Object[] arraySegonsInserits) {
		System.out.println("arrayObjectesQualsevolOrdre");
		for (int i = 0; i < arrayObjectes.size(); i++) {
			System.out.println("Objecte " + (i + 1) + " : " + arrayObjectes.get(i));
		}
		System.out.println("arraySegonsInserits");
		for (int i = 0; i < arrayObjectes.size(); i++) {
			System.out.println("Objecte " + (i + 1) + " : " + arraySegonsInserits[i]);
		}
	}

	public static void display2(Set<Object> uniqueObjectesSet, Object[] arraySegonsInserits) {
		System.out.println("arrayObjectes");
		for (Object obj : uniqueObjectesSet) {
			System.out.println("Objecte  " + obj);
		}
		System.out.println("arraySegonsInserits");
		for (int i = 0; i < uniqueObjectesSet.size(); i++) {
			System.out.println("Objecte " + (i + 1) + " : " + arraySegonsInserits[i]);
		}
	}

	public static boolean orderArraySegonsInserits(ArrayList<Object> arrayObjectes, Object[] arraySegonsInserits) {
		if (arrayObjectes.size() > 0) {
			for (int i = 0; i < arrayObjectes.size(); i++) {
				if (!arrayObjectes.get(i).equals(arraySegonsInserits[i])) {
					System.out.println(arrayObjectes.get(i));
					System.out.println(arrayObjectes.get(i));

					return false;
				}
			}
			return true;

		} else {
			if (arraySegonsInserits.length > 0) {
				return false;
			} else {
				return true;
			}

		}

	}

	public static boolean orderArrayQualsevolOrdre(Set<Object> uniqueObjectesSet, Object[] arraySegonsInserits) {
		if (uniqueObjectesSet.size() == arraySegonsInserits.length) {
			for (int i = 0; i < arraySegonsInserits.length; i++) {

				if (!uniqueObjectesSet.contains(arraySegonsInserits[i])) {

					return false;
				}
			}
			return true;

		} else {
			return false;

		}

	}

	public static boolean objecteAfegitUnaVegada(Object obj, ArrayList<Object> arrayObjectes) {
		int vegadas = 0;
		for (int i = 0; i < arrayObjectes.size(); i++) {

			if (arrayObjectes.get(i).equals(obj)) {
				vegadas++;
				System.out.println(obj);
				System.out.println(vegadas);

			}
		}
		if (vegadas == 1) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean llistaNoConteAquestObjecte(Object obj, ArrayList<Object> arrayObjectes) {
		int vegadas = 0;
		for (int i = 0; i < arrayObjectes.size(); i++) {

			if (arrayObjectes.get(i).equals(obj)) {
				vegadas++;
				System.out.println(obj);
				System.out.println(vegadas);

			}
		}
		if (vegadas == 0) {
			return true;
		} else {
			return false;
		}
	}

}
