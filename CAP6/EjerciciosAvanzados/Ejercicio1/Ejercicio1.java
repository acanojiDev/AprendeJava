package AprendeJava.CAP6.EjerciciosAvanzados.Ejercicio1;

public class Ejercicio1 {
	public static void main(String[] args) {
		int suma;
		int numeroGenerado;

		suma = 0;
		System.out.print("Tirada de tres dados: ");
		for (int i = 1; i <= 3; i++) {
			numeroGenerado = (int)(Math.random()*4 + 1);
			suma += numeroGenerado;
			System.out.print( numeroGenerado + " ");
		}
		System.out.println();
		System.out.println("Suma: " + suma);
	}
}
