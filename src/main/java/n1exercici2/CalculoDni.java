package n1exercici2;

public class CalculoDni {
	private static char[] taulaLletres = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
			'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };



	public char lletraDNI(int numero) {

		return taulaLletres[numero % 23];

	}


}
