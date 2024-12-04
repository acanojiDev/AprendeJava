package Ejercicio13;

public class Ejercicio13 {
	public static void main(String[] args) {
		int limite;
		long numero1 = 0;
		long numero2 = 1;
		long temp;

		System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
		System.out.print("Por favor, introduzca n: ");
		limite = Integer.parseInt(System.console().readLine());
		for (int i = 1; i <= limite; i++) {
			System.out.print(numero1 + " ");
			temp = numero1 + numero2;
			numero1 = numero2;
			numero2 = temp;
		}
	}
}
