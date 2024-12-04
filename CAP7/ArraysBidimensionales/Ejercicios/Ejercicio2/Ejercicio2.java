package ArraysBidimensionales.Ejercicios.Ejercicio2;

public class Ejercicio2 {
	private static int[][] pedirDatos(){
		int[][] datos = new int[4][5];
		System.out.println("Porfavor introduzca los números (enteros) en el array.");
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				System.out.printf("Fila %d, columna %d: ", i, j);
				datos[i][j] = Integer.parseInt(System.console().readLine());
			}
		}
		return datos;
	}
	private static void imprimirTabla(){
		int[][] numeros = pedirDatos();
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
		/*Escribe un programa que pida 20 números enteros. Estos números
		se deben introducir en un array de 4 filas por 5 columnas.
		El programa mostrará las sumas parciales de filas y columnas
		igual que si de una hoja de cálculo se tratara.
		La suma total debe aparecer en la esquina inferior derecha. */
		imprimirTabla();
	}
}
