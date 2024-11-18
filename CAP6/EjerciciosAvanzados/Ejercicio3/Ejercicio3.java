package AprendeJava.CAP6.EjerciciosAvanzados.Ejercicio3;

public class Ejercicio3 {
	public static void main(String[] args) {
			int carta;
			String cartaElegida;
			int palo;
			String paloElegido;

			cartaElegida  = "";
			paloElegido =  "";
			carta = ((int)(Math.random()*12) + 1);
			if(carta == 8 || carta == 9)
				carta += 2;
			switch (carta) {
				case 1:
					cartaElegida = "As";
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
				case 10:
					cartaElegida = "Sota";
					break;
				case 11:
					cartaElegida = "Caballo";
					break;
				case 12:
					cartaElegida = "Rey";
					break;
				default:
					System.out.println("Error");
					break;
			}
			palo = (int)(Math.random() * 4 + 1);
			switch (palo) {
				case 1:
					paloElegido = ("de oros");
					break;
				case 2:
					paloElegido =("de copas");
					break;
				case 3:
					paloElegido =( "de espadas");
					break;
				case 4:
					paloElegido = ("de bastos");
					break;
				default:
					System.out.println("Error de palos");
					break;
			}
			System.out.println(cartaElegida + " " + paloElegido);
	}
}
