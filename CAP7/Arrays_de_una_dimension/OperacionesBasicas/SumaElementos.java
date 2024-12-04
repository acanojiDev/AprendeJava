package OperacionesBasicas;

public class SumaElementos {
	public static void main(String[] args) {
		int[] numeros = {5,8,14,25,15};
		int suma = 0;

		for (int numero : numeros) {
			suma += numero;
		}
		System.out.println("La suma total de todos los elementos es: "+ suma);
	}
}
