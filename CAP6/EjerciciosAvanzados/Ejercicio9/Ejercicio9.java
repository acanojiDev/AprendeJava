package AprendeJava.CAP6.EjerciciosAvanzados.Ejercicio9;

public class Ejercicio9 {
	public static void main(String[] args) {
		int numeroGenerado;
		int contador = 0;
		do {
			numeroGenerado = (int)((Math.random()*100) +  1 );
			if(numeroGenerado % 2 == 0){
				System.out.print(numeroGenerado +  " ");
				contador++;
			}
		} while (numeroGenerado != 24);
		System.out.println();
		System.out.printf("Se han generado %d números.",contador);
	}
}
