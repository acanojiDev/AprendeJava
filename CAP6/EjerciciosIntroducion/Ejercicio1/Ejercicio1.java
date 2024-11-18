package AprendeJava.CAP6.EjerciciosIntroducion.Ejercicio1;

public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("Diez números aleatorios:\n");
		//Bucle sin casteo
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random()); //que si no le hacemos casting nos devolvera doubles(numeros decimales)
		}
	}
}
