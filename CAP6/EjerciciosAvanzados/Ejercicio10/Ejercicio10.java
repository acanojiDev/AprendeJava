package AprendeJava.CAP6.EjerciciosAvanzados.Ejercicio10;

public class Ejercicio10 {
	public static void main(String[] args) {
		int limite;
		int simbolo;

		for (int i = 1; i <= 10; i++) {
			limite = (int)((Math.random()*40) + 1);
			simbolo = (int)((Math.random()*6) + 1);
			for (int j = 1; j <= limite ; j++) {
				switch (simbolo) {
					case 1:
						System.out.print("*");
						break;
					case 2:
						System.out.print("-");
						break;
					case 3:
						System.out.print("=");
						break;
					case 4:
						System.out.print(".");
						break;
					case 5:
						System.out.print("|");
						break;
					case 6:
						System.out.print("@");
						break;
					default:
						break;
				}
			}
			System.out.println();
		}
	}
}
