package ArraysBidimensionales.Ejercicios.Ejercicio6;
public class Ejercicio6{

	private static int[][] generarDatosAleatorios(){
		int[][] datos = new int[6][10];
		for (int i = 0; i < 10; i++) {
			if(i == 0)
				System.out.printf("%2d",i);
			else{
				System.out.printf("%5d",i);
			}
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				datos[i][j] = (int)(Math.random()*1001);
			}
			System.out.println();
		}
		return datos;
	}
	public static void encontrarLimites(){
		int[][] datos = generarDatosAleatorios();
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		int maxFila = -1, maxColumna = -1, minFila = -1, minColumna = -1;
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				if (maximo < datos[i][j]) {
					maximo = datos[i][j];
					maxFila = i;
					maxColumna = j;
				}
				if (minimo > datos[i][j]) {
					minimo = datos[i][j];
					minFila = i;
					minColumna = j;
				}
			}
		}
		System.out.printf("El maximo es %d y esta en la fila %d, columna %d\n", maximo, maxFila, maxColumna);
		System.out.printf("El minimo es %d y esta en la fila %d, columna %d\n", minimo, minFila, minColumna);
	}
	public static void main(String[] args) {

	}
}
