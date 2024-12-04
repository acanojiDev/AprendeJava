package OperacionesBasicas;

public class RecorrerArray {
	public static void main(String[] args) {
		int[] numeros = {10,20,30,40,50};
		//Usando bucle for
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Elemento en posicion %d: %d\n",i,numeros[i]);
		}

		//Usando bucle foreach
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}
}
