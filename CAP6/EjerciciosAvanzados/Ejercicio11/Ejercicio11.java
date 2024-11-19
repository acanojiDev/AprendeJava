package AprendeJava.CAP6.EjerciciosAvanzados.Ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		int calificacion;
		String calificacionGenerada;
		int contadorInsuficientes = 0;
		int contadorsuficientes = 0;
		int contadorBienes = 0;
		int contadorNotables = 0;
		int contadorSobresalientes = 0;

		System.out.println("Este programa muestra 20 notas generadas al azar.");
		for (int i = 1; i <= 20; i++) {
			calificacion = (int)((Math.random()*11));
				if(calificacion <= 4){
					calificacionGenerada = "Insuficiente";
					contadorInsuficientes++;
					System.out.print(calificacionGenerada + " ");
				}else if(calificacion == 5){
					calificacionGenerada = "Suficiente";
					contadorsuficientes++;
					System.out.print(calificacionGenerada + " ");
				}else if(calificacion == 6){
					calificacionGenerada = "Bien";
					contadorBienes++;
					System.out.print(calificacionGenerada + " ");
				}else if(calificacion == 7 || calificacion == 8){
					calificacionGenerada = "Notable";
					contadorNotables++;
					System.out.print(calificacionGenerada + " ");
				}else{
					calificacionGenerada = "Sobresaliente";
					contadorSobresalientes++;
					System.out.print(calificacionGenerada + " ");
				}
			}
			System.out.println();
			System.out.printf("Nº de insuficientes: %d\n",contadorInsuficientes);
			System.out.printf("Nº de suficientes: %d\n",contadorsuficientes);
			System.out.printf("Nº de bienes: %d\n",contadorBienes);
			System.out.printf("Nº de notables: %d\n",contadorNotables);
			System.out.printf("Nº de sobresalientes: %d\n",contadorSobresalientes);
		}
	}
