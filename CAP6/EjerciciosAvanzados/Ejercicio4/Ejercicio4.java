package AprendeJava.CAP6.EjerciciosAvanzados.Ejercicio4;

public class Ejercicio4 {
	public static void main(String[] args) {
		System.out.println("Estos son 20 numeros generados al azar entre el 1 y el 10");
		for (int i = 1; i <= 20; i++) {
			System.out.print((int)(Math.random()*11) +  " ");
		}
	}
}
