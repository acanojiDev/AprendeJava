package AprendeJava.CAP6.EjerciciosAvanzados.Ejercicio13;

public class Ejercicio13 {
	public static void main(String[] args) {
		int primerDado;
		int segundoDado;
		do {
			primerDado = (int)((Math.random()*6) + 1);
			segundoDado = (int)((Math.random()*6) + 1);
			System.out.print(primerDado + " " + segundoDado);
			System.out.println();
		} while (primerDado != segundoDado);
	}
}
