public class Ejercicio12 {
	public static int[] leer(){
		System.out.println("Introduzca 10 números: ");
		int numeros[] = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(System.console().readLine());
		}
		return numeros;
	}
	public static void generarArrayOriginal(){
		int[] numeros = leer();
		System.out.print("Índice ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%-6d ", i);
		}
		System.out.println();
		System.out.print("Valor ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%-6d ", numeros[i]);
		}
		System.out.println();
	}
    public static void main(String[] args) {
		leer();
		System.out.println("Introduzca la posicion inicial (0 - 9): ");
		int posicionInicial = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca la posicion final (0 - 9): ");
		int posicionFinal = Integer.parseInt(System.console().readLine());
		
	}
}
