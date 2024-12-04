public class Ejercicio11 {
	public static int[] pedirNumeros(){
		int[] numeros = new int[10];
		System.out.println("Introduzca 10 numeros: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(System.console().readLine());
		}
		return numeros;
	}
	public static void generarArrayOriginal(int[] array){
		int[] numeros = array;
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
	public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

	public static void generarArrayModificado(int[] array){
		int[] numeros = array;
		System.out.print("Índice ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%-6d ", i);
		}
		System.out.println();
		System.out.print("Valor ");
		for (int numero : numeros) {
			if(esPrimo(numero))
			System.out.printf("%-6d ", numero);
		}
		for (int numero : numeros) {
			if(!esPrimo(numero))
			System.out.printf("%-6d ", numero);
		}
	}

	public static void generarTabla(int[] array){
		generarArrayOriginal(array);
		generarArrayModificado(array);
	}
    public static void main(String[] args) {
		int[] numeros = pedirNumeros();
		generarTabla(numeros);
	}
}
