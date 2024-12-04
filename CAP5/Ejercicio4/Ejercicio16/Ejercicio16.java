package Ejercicio16;

public class Ejercicio16 {
	public static void main(String[] args) {
		int numero;
		int ultimoDigito;
		int numeroInvertido;

		numeroInvertido = 0;
		System.out.println("Introduzca un numero: ");
		numero = Integer.parseInt(System.console().readLine());
		while (numero != 0) {
			ultimoDigito = numero % 10;
			numeroInvertido = numeroInvertido * 10 + ultimoDigito;
			numero /= 10;
		}
		System.out.println("Numero Invertido: "+ numeroInvertido);
	}
}
