package AprendeJava.CAP6.EjerciciosAvanzados.Ejercicio2;

public class Ejercicio2 {
	public static void main(String[] args) {
		int carta;
		String cartaElegida;
		int palo;
		String paloElegido;

		cartaElegida  = "";
		paloElegido =  "";
		carta = (int)(Math.random()*13 + 1);
		switch (carta) {
			case 1:
				cartaElegida = "A";
				break;
			case 2:
				cartaElegida = "2";
				break;
			case 3:
				cartaElegida = "3";
				break;
			case 4:
				cartaElegida = "4";
				break;
			case 5:
				cartaElegida = "5";
				break;
			case 6:
				cartaElegida = "6";
				break;
			case 7:
				cartaElegida = "7";
				break;
			case 8:
				cartaElegida = "8";
				break;
			case 9:
				cartaElegida = "9";
				break;
			case 10:
				cartaElegida = "10";
				break;
			case 11:
				cartaElegida = "J";
				break;
			case 12:
				cartaElegida = "Q";
				break;
			case 13:
				cartaElegida = "K";
				break;
			default:
				break;
		}
		palo = (int)(Math.random() * 4 + 1);
		switch (palo) {
			case 1:
				paloElegido = ("de corazones");
				break;
			case 2:
				paloElegido =("de picas");
				break;
			case 3:
				paloElegido =( "de diamantes");
				break;
			case 4:
				paloElegido = ("de corazones");
				break;
			default:
				break;
		}
		System.out.println(cartaElegida + " " + paloElegido);
	}
}
