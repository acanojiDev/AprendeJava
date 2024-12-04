package OperacionesBasicas;

public class CalcularValorMinimo {
	public static void main(String[] args) {
		int[] numeros = {10,20,30,40,50};
		int minimo = numeros[0];

		for (int numero : numeros) {
			if (numero < minimo)
				minimo = numero;
		}
		System.out.println("El valor mas pequeño es: "+minimo);
	}
}
