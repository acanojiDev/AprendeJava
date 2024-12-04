package ArraysBidimensionales.Ejercicios.Ejercicio1;

public class Ejercicio1 {
	public static void main(String[] args) {
		/*Define un array de números enteros de 3 filas por 6 columnas
		con nombre num y asigna los valores según la siguiente tabla.
		Muestra el contenido de todos los elementos del array dispuestos en forma de tabla. */

		/*primera caja siempre filas y segunda columnas */
		int[][] num = {
			{0,30,2,0,0,5},
			{75,0,0,0,0,0},
			{0,0,-2,9,0,11},
		};
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("%-5d",num[i][j]);
			}
			System.out.println();
		}
	}
}
