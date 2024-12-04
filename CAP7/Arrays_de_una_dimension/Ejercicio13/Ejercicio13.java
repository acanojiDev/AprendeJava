public class Ejercicio13 {
	public static int[] generarNumero(){
		int[] numeros = new int[100];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]  = (int)(Math.random()*500);
		}
		return numeros;
	}
	public static void DestacarMinimo(){
		int[] numeros = generarNumero();
		int minimo = numeros[0];
		for (int numero : numeros) {
			if(numero < minimo)
				minimo = numero;
		}
		for (int numero : numeros) {
			if(numero == minimo)
				System.out.printf("**%d** ",numero);
			else
				System.out.printf("%d ",numero);
		}
	}

	public static void DestacarMaximo(){
		int[] numeros = generarNumero();
		int maximo = numeros[0];
		for (int numero : numeros) {
			if(maximo < numero)
				maximo = numero;
		}
		for (int numero : numeros) {
			if(numero == maximo)
				System.out.printf("**%d** ",numero);
			else
				System.out.printf("%d ",numero);
		}
	}
	public static void elegirDestacado(){
		System.out.print("¿Que quiere destacar? (1 - mínimo, 2 - máximo): ");
		int respuesta = Integer.parseInt(System.console().readLine());
		switch (respuesta) {
			case 1:
				DestacarMinimo();
				break;
			case 2:
				DestacarMaximo();
				break;
			default:
				System.out.println("Introduzco una opción inválida");
				break;
		}
	}
    public static void main(String[] args) {
		elegirDestacado();
	}
}
