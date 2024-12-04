package OperacionesBasicas;

public class PromedioElementos {
	public static void main(String[] args) {
		int[] numeros = {5,8,14,25,15};
		int suma = 0;
		int contador = 0;

		for (int numero : numeros) {
			suma += numero;
			contador++;
		}
		System.out.println("La media es: "+(double)suma/contador);
	}
}
