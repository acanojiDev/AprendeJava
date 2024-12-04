public class Ejercicio9 {
	public static int[] pedirNumeros(){
		int[] numeros = new int[8];
		System.out.println("Introduzca 8 números enteros, pulse INTRO después de cada número");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(System.console().readLine());
		}
		return numeros;
	}
    public static void main(String[] args) {
		int[] calcularNumeros = pedirNumeros();
		for (int numero : calcularNumeros) {
			if(numero % 2 == 0){
				System.out.printf("%d par\n",numero);
			}else{
				System.out.printf("%d impar\n",numero);
			}
		}
	}
}
