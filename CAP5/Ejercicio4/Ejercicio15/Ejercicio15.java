package Ejercicio15;

public class Ejercicio15 {
	public static void main(String[] args) {
		System.out.print("Introduzca la base: ");
		int base = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca el exponente máximo: ");
		int exponenteMaximo = Integer.parseInt(System.console().readLine());
		/*Utilizando Math.pow */
		for (int i = 1; i <= exponenteMaximo; i++) {
			System.out.printf("%d^%d = %d\n",base,i,(int)(Math.pow(base, i)));
		}
		/*Sin utilizar Math.pow */
		for (int i = 1; i <= exponenteMaximo; i++) {
			int resultado = 0;
			for (int j = i; j > 0; j--) {
				resultado = base * base;
			}
			System.out.println(resultado);
		}
	}
}
