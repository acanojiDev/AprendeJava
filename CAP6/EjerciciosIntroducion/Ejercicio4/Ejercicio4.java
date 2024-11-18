package AprendeJava.CAP6.EjerciciosIntroducion.Ejercicio4;

public class Ejercicio4 {
	public static void main(String[] args) {
		/**Si queremos que genere numeros que esten entre X o Y
		 * es tan facil como sumarle un numero y este se sumara al max y al
		 * min es decir si le sumo 1 el minimo sera 0 + 1 = 1
		 * y el  maximo 9 + 1 = 10
		*/
		System.out.println("10 numeros aleatorios entre 1 y 10(sin decimales): ");
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random()*10 + 1) + " ");
		}
		/**Basicamente por un lado el * 10 es para desplazar la coma
		 *  es decir con el * 10 solo llegariamos de 0 a 9
		 *  si por ejemplo ponemos * 100 llegaria de 0 a 99
		 *
		 * Y por otro lado el + 1 es para que se le sume tanto al minimo como
		 * al maximo por ejemplo en el ejemplo al tener * 10 y + 1 este va a llegar
		 * de 1 a 10 pero si no tuviera el + 1  llegaria de 0 a 9.
		 * Con valores mayores ocurre igual *100 + 1 llegaria desde el 1 al 100 y sin
		 * el + 1 del 0 al 99; no tiene porque ser siempre 1 o 10 podemos ir jugando
		 * con estos numeros para conseguir lo que nos piden
		 */
	}
}
