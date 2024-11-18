package AprendeJava.CAP6.EjerciciosIntroducion.Ejercicio5;

public class Ejercicio5 {
	/**Al igual que se puede generar numeros podemos generar palabras de forma indirecta
	 * es decir con un switch
	 */
	public static void main(String[] args) {
		System.out.println("Genera al azar piedra papel o tijera");
		int mano = (int)(Math.random()*3);

		/*De la misma forma podriamos generar aleatoriamente un dia de la semana */
		switch (mano) {
			case 0:
				System.out.println("piedra");
				break;
			case 1:
				System.out.println("papel");
				break;
			case 2:
				System.out.println("tijera");
				break;
			default:
				break;
		}
	}
}
