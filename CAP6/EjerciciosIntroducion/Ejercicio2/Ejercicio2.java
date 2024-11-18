package AprendeJava.CAP6.EjerciciosIntroducion.Ejercicio2;

public class Ejercicio2 {
	public static void main(String[] args) {
		/** Si quisieramos imprimir numeros entre el 0 y el 10 unicamente tendriamos
		 * que multiplicar por 10, es decir desplazar la coma un lugar.
		 */
		System.out.println("10 números aleatorios entre 0 y 10");
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random()*10 + " ");
		}
	}
}
