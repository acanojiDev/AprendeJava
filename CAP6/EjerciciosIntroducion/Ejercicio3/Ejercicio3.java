package AprendeJava.CAP6.EjerciciosIntroducion.Ejercicio3;

public class Ejercicio3 {
	public static void main(String[] args) {
		/** Si queremos hacerle un casteo para que imprima enteros
		 * es tan sencillo como simplmente hacerle el casteo antes.
		*/
		System.out.println("10 numeros aleatorios entre 0 y 9 (sin decimales): ");
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random()*10) + " ");
		}
	}
}
