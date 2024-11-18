package AprendeJava.CAP6.EjerciciosAvanzados.Ejercicio5;

public class Ejercicio5 {
	public static void main(String[] args) {
		/*Hacerlo con constantes para que sea mas optimo y eficiente */
		int numero;
		int maximo;
		int minimo;
		int suma;

		minimo = 199;
		maximo = 0;
		suma = 0;
		System.out.print("A continuacion se mostrara");
		System.out.println("50 numeros generados aleatoriamente entre 100 y 199 (ambos incluidos)");
		for (int i = 1; i <= 50; i++) {
			numero = ((int)(Math.random()*99) + 100);
			System.out.print(numero + " ");
			suma += numero;
			if(maximo < numero)
				maximo = numero;
			if(minimo > numero)
				minimo = numero;
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("La media de los números es: " + (double) suma / 50);
		System.out.println("El máximo es: " + maximo);
		System.out.println("El mínimo es: " + minimo);
	}
}
