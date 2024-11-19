package AprendeJava.CAP6.EjerciciosAvanzados.Ejercicio12;

public class Ejercicio12 {
	public static void main(String[] args) {
		final int MAX = 126;
		final int MIN = 32;
		int caracter;
		char caracterAscii;
		for (int i = 1; i <= 15; i++) {
			for (int j = 0; j <= 55; j++) {
				caracter = (int)((Math.random()*MAX - MIN + 1) + MIN);
				caracterAscii = (char)caracter;
				System.out.print(caracterAscii);
			}
			System.out.println();
		}
	}
}
