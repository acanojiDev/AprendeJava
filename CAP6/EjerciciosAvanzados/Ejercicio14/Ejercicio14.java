package AprendeJava.CAP6.EjerciciosAvanzados.Ejercicio14;

public class Ejercicio14 {
	public static void main(String[] args) {
		int notaMusical;
		final int MAX;

		MAX = (int)((Math.random()*7) + 1 );
		for (int i = 1; i <= MAX ; i++) {
			for (int j= 1; j <= 4; j++) {
				notaMusical = (int)((Math.random() * 7) + 1);
				switch (notaMusical) {
					case 1:
						System.out.print("do ");
						break;
					case 2:
						System.out.print("re ");
						break;
					case 3:
						System.out.print("mi ");
						break;
					case 4:
						System.out.print("fa ");
						break;
					case 5:
						System.out.print("sol ");
						break;
					case 6:
						System.out.print("la ");
						break;
					case 7:
					System.out.print("si ");
						break;
					default:
						break;
				}
			}
			if(i == MAX)
				System.out.print("||");
			else
				System.out.print("| ");
		}
	}
}
