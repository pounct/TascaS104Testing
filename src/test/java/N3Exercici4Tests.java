import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import n3exercici4.Book;
import n3exercici4.N3Exercici4;

public class N3Exercici4Tests {

	@Test
	public void testOrderArraySegonsInserits() {

		ArrayList<Object> arrayObjectes = new ArrayList<Object>();

		Object o1 = "stringObjecte";
		arrayObjectes.add(o1);
		Object o2 = 14;
		arrayObjectes.add(o2);
		Object o3 = new Book(12, "titulo1", "edicion1");
		arrayObjectes.add(o3);
		Object o4 = 1800L;
		arrayObjectes.add(o4);
		Object o5 = 1.99F;
		arrayObjectes.add(o5);

		Object[] arraySegonsInserits = new Object[] { "stringObjecte", 14, new Book(12, "titulo1", "edicion1"), 1800L,
				1.99F };

		// N3Exercici4.display(arrayObjectes);
		assertThat(N3Exercici4.orderArraySegonsInserits(arrayObjectes, arraySegonsInserits)).isEqualTo(true);
	}

	@Test
	public void testOrderArrayQualsevolOrdre() {

		Object[] arraySegonsInserits = new Object[] { "stringObjecte", 14, new Book(12, "titulo1", "edicion1"), 1800L,
				1.99F };

		ArrayList<Object> arrayObjectes = new ArrayList<Object>();

		Object o1 = "stringObjecte";
		arrayObjectes.add(o1);
		Object o2 = 14;
		arrayObjectes.add(o2);
		Object o3 = new Book(12, "titulo1", "edicion1");
		arrayObjectes.add(o3);
		Object o4 = 1800L;
		arrayObjectes.add(o4);
		Object o5 = 1.99F;
		arrayObjectes.add(o5);

		Set<Object> uniqueObjectesSet = new HashSet<Object>(arrayObjectes);

		assertThat(N3Exercici4.orderArrayQualsevolOrdre(uniqueObjectesSet, arraySegonsInserits)).isEqualTo(true);
	}

	@Test
	public void testObjecteAfegitUnaVegada() {

		//Object[] arraySegonsInserits = new Object[] { "stringObjecte", 14, new Book(12, "titulo1", "edicion1"), 1800L,1.99F };

		ArrayList<Object> arrayObjectes = new ArrayList<Object>();

		Object o1 = "stringObjecte";
		arrayObjectes.add(o1);
		Object o2 = 14;
		arrayObjectes.add(o2);
		Object o3 = new Book(12, "titulo1", "edicion1");
		arrayObjectes.add(o3);
		Object o4 = 1800L;
		arrayObjectes.add(o4);
		Object o5 = 1.99F;
		arrayObjectes.add(o5);

		//Set<Object> uniqueObjectesSet = new HashSet<Object>(arrayObjectes);

		assertThat(N3Exercici4.objecteAfegitUnaVegada(o1, arrayObjectes)).isEqualTo(true);
	}
	
	@Test
	public void testllistaNoConteAquestObjecte() {

		//Object[] arraySegonsInserits = new Object[] { "stringObjecte", 14, new Book(12, "titulo1", "edicion1"), 1800L,1.99F };

		ArrayList<Object> arrayObjectes = new ArrayList<Object>();

		Object o1 = "stringObjecte";
		//arrayObjectes.add(o1);
		Object o2 = 14;
		arrayObjectes.add(o2);
		Object o3 = new Book(12, "titulo1", "edicion1");
		arrayObjectes.add(o3);
		Object o4 = 1800L;
		arrayObjectes.add(o4);
		Object o5 = 1.99F;
		arrayObjectes.add(o5);

		//Set<Object> uniqueObjectesSet = new HashSet<Object>(arrayObjectes);

		assertThat(N3Exercici4.llistaNoConteAquestObjecte(o1, arrayObjectes)).isEqualTo(true);
	}
	

}
