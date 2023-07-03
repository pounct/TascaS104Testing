
package n1exercici1;

import java.util.ArrayList;

public class N1Exercici1 {

	public static void main(String[] args) {
		ArrayList<String> months = monthsDelAny();
		System.out.println(months);

	}
	public static ArrayList<String> monthsDelAny(){
		ArrayList<String> months = new ArrayList<String>();
		months.add("Gener");
		months.add("Febrer");
		months.add("Març");
		months.add("Abril");
		months.add("Maig");
		months.add("Juny");
		months.add("Juliol");
		months.add("Agost");
		months.add("Setembre");
		months.add("Octubre");
		months.add("Novembre");
		months.add("Desembre");
		return months;
		
	}

}