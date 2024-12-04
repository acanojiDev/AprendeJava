public class Ejercicio7 {
    public static void main(String[] args) {
		int[] numeros = new int[100];
		int numeroSustituir;
		int nuevoValor;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] =  (int)(Math.random()*20);
			System.out.printf("%d ",numeros[i]);
		}
		System.out.println();
		System.out.println("Introduzca un número de los que se han mostrado: ");
		numeroSustituir = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el nuevo valor para sustituirlo: ");
		nuevoValor = Integer.parseInt(System.console().readLine());
		for (int numero : numeros) {
			if(numeroSustituir == numero){
				numero = nuevoValor;
				System.out.printf("\"%d\" ",numero);
			}else
				System.out.printf("%d ",numero);
		}
	}
}
