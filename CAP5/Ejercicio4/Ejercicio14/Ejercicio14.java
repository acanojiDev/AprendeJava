package Ejercicio14;

public class Ejercicio14 {
	public static void main(String[] args) {
		int numero;
		int positivos = 0;
		int negativos = 0;

		System.out.println("Porfavor introduzca 10 números enteros: ");
		for (int i = 1; i <= 10; i++) {
			numero = Integer.parseInt(System.console().readLine());
			numero = (numero <= 0)?negativos++ : positivos++;
		}
		System.out.printf("Ha introducido %d positivos y %d negativos\n",positivos,negativos);
	}
}
