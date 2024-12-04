package ArraysBidimensionales.Ejercicios.Ejercicio3;
public class Ejercicio3{
	private static int[][] generarDatosAleatorios(){
		int[][] datos = new int[4][5];
		System.out.println("Porfavor introduzca los números (enteros) en el array.");
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				datos[i][j] = (int)((Math.random()*899)+101);
				System.out.printf("Fila %d, columna %d: %d\n", i, j,datos[i][j]);
			}
		}
		return datos;
	}
	private static void imprimirTabla(){
		int[][] numeros = generarDatosAleatorios();
		int sumafilas;
		int sumaTotal = 0;
		for (int i = 0; i < numeros.length; i++) {
			sumafilas = 0;
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.printf("%-5d",numeros[i][j]);
				sumafilas += numeros[i][j];
			}
			sumaTotal += sumafilas;
			System.out.printf(" | %5d     \n", sumafilas);
		}
		System.out.println("------------------------------------------");
		for (int j = 0; j < numeros[0].length; j++) {
			sumafilas = 0;
			for (int i = 0; i < numeros.length; i++) {
				sumafilas += numeros[i][j];
				sumaTotal += sumafilas;
			}
			System.out.printf("%-5d", sumafilas);
		}
		System.out.printf(" | %6d     \n", sumaTotal);
		System.out.println();
	}
	public static void main(String[] args) {
		/*Modifica el programa anterior de tal forma que los números
		 que se introducen en el array se generen de
		forma aleatoria (valores entre 100 y 999). */
		imprimirTabla();
	}
}
