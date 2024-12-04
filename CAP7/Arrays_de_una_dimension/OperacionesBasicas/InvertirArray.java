package OperacionesBasicas;

public class InvertirArray {
	public static void main(String[] args) {
		int[] numeros = {10,20,30,40,50};
		/**
		 * Primero cogemos y hacemos un bucle que llegue
		 * hasta la mitad ya que solo queremos invertirlo
		 * y despues le decimos a temp que valga el valor actual
		 * de numeros
		 * A numeros le decimos que accede a su ultimo elemento - 1 - i
		 * Es decir a  = 4 - 1 = 3 - 0 que vale i a su tercera posicion
		 * y valga lo que vale numeros[i] por lo que el 10 se pondra en
		 * la ultima posicion en la primera aparicion
		 * y el 20 el penultimo en la segunda iteracion y ya se habran invertido los
		 * elementos del array
		 * 		 */
		for (int i = 0; i < numeros.length / 2; i++) {
			int temp = numeros[i];
			numeros[i] = numeros[numeros.length - 1 - i];
			numeros[numeros.length - 1 - i] = temp;
		}
		System.out.println("Array invertido: ");
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}
}
