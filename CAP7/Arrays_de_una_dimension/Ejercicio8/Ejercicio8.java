public class Ejercicio8 {
	public static void dibujarGrafico(){
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
		"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		int[] temperaturas = obtenerTemperatura();
		for (int i = 0; i < meses.length; i++) {
			System.out.printf("%-10s |", meses[i]);
			for (int j = 0; j < temperaturas[i]; j++){
				System.out.print("*");
			}
			System.out.printf(" %dºC",temperaturas[i]);
			System.out.println();
		}
	}

	public static int[] obtenerTemperatura(){
			int[] temperatura = new int[12];
			String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
			"julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
			for (int i = 0; i < 12; i++) {
				System.out.println("Introduzca la temperatura media de " + meses[i] + ": ");
				temperatura[i] = Integer.parseInt(System.console().readLine());
			}
			return temperatura;
	}
    public static void main(String[] args) {
		dibujarGrafico();
	}
}
