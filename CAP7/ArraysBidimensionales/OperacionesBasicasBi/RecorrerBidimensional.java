package ArraysBidimensionales.OperacionesBasicasBi;

public class RecorrerBidimensional {
	public static void main(String[] args) {
		int[][] matriz = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		//Usando bucle fori
		for (int i = 0; i < matriz.length; i++) { // Recorre las filas
			for (int j = 0; j < matriz[i].length; j++) { // Recorre las columnas
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		//Usando bucle foreach
		for (int[] fila : matriz) {
			for (int elemento : fila) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
	}
}
