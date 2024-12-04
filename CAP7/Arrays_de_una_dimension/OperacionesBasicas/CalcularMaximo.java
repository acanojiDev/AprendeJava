package OperacionesBasicas;

public class CalcularMaximo {
	public static void main(String[] args) {
		int[] numeros = {1,2,3,4,5};
		/**
		 * Incializamos max a la primera posicion de numeros para
		 * que comienze desde la primera posicion hasta el final
		 * para asegurarse de que no se le escapa ningún número
		 */
		int max = numeros[0];

		for (int numero : numeros) {
			if (numero > max){
				max = numero;
			}
		}
		System.out.printf("El valor maximo es: %d", max);
	}
}
	