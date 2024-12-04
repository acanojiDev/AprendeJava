package ArraysBidimensionales.OperacionesBasicasBi;

public class Declaracion {
	public static void main(String[] args) {
		/*RECORDAR QUE SE SIGUE INICIALIZANDO A 0 LOS INDICES */
		//tipo[][] nombre
		int[][] nombreArray;
		//Inicialización
		/*a) Especificando el tamaño al momento de la declaración */
		int[][] matriz = new int[3][4]; //3 filas y 4 columnas
		/*b) Inicialización directa con valores */
		int[][] matriz2 = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		/*C) Creando filas por separado */
		int[][] matriz3 = new int[3][];
		matriz3[0] = new int[]{1,2};
		matriz[1] = new int[]{3,4,5};
		matriz[2] = new int[]{6};

		/*Acceso a elementos */
		int[][] matriz4 = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
		};

		int valor = matriz4[1][2];
		matriz4[0][0] = 10;
	}
}
