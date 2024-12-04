public class Ejercicio10 {
	public static int[] generarNumeros(){
		int[] numeros = new int[20];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random() * 100);
		}
		return numeros;
	}
    public static void main(String[] args) {
		int[] numerosGenerados = generarNumeros();
		for (int numero : numerosGenerados) {
			if(numero % 2 == 0)
				System.out.printf("%d ",numero);
		}
		for (int numero : numerosGenerados) {
			if(numero % 2 != 0)
				System.out.printf("%d ",numero);
		}
	}
}
