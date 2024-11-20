package AprendeJava.CAP6.EjerciciosAvanzados.Ejercicio15;

public class Ejercicio15 {
	public static void main(String[] args) {
		int notaMusical;
		String _do = "do";
		String re = "re";
		String mi = "mi";
		String fa = "fa";
		String sol = "sol";
		String la = "la";
		String si = "si";
		String notaMusicalGenerada = "";
		String primeraNota = "";
		final int MAX;

		MAX = (int)((Math.random()*7) + 1 );
		for (int i = 1; i <= MAX ; i++) {
			if(i < MAX){
				for (int j= 1; j <= 4; j++) {
					notaMusical = (int)((Math.random() * 7) + 1);
					switch (notaMusical) {
						case 1:
							notaMusicalGenerada = _do;
							System.out.print(notaMusicalGenerada + " ");
							break;
						case 2:
							notaMusicalGenerada = re;
							System.out.print(notaMusicalGenerada + " ");
							break;
						case 3:
							notaMusicalGenerada = mi;
							System.out.print(notaMusicalGenerada + " ");
							break;
						case 4:
							notaMusicalGenerada = fa;
							System.out.print(notaMusicalGenerada + " ");
							break;
						case 5:
							notaMusicalGenerada = sol;
							System.out.print(notaMusicalGenerada + " ");
							break;
						case 6:
							notaMusicalGenerada = la;
							System.out.print(notaMusicalGenerada + " ");
							break;
						case 7:
							notaMusicalGenerada = si;
							System.out.print(notaMusicalGenerada + " ");
							break;
						default:
							break;
					}
					if(i == 1 && j == 1)
					primeraNota = notaMusicalGenerada;
				}
			}else if(i == MAX){
				for (int j= 1; j < 4; j++) {
					notaMusical = (int)((Math.random() * 7) + 1);
					switch (notaMusical) {
						case 1:
							notaMusicalGenerada = _do;
							System.out.print(notaMusicalGenerada + " ");
							break;
						case 2:
							notaMusicalGenerada = re;
							System.out.print(notaMusicalGenerada + " ");
							break;
						case 3:
							notaMusicalGenerada = mi;
							System.out.print(notaMusicalGenerada + " ");
							break;
						case 4:
							notaMusicalGenerada = fa;
							System.out.print(notaMusicalGenerada + " ");
							break;
						case 5:
							notaMusicalGenerada = sol;
							System.out.print(notaMusicalGenerada + " ");
							break;
						case 6:
							notaMusicalGenerada = la;
							System.out.print(notaMusicalGenerada + " ");
							break;
						case 7:
							notaMusicalGenerada = si;
							System.out.print(notaMusicalGenerada + " ");
							break;
						default:
							break;
					};
					if(i == MAX && j == 3)
						System.out.print(primeraNota);
				}
			}
			if(i == MAX)
				System.out.print("||");
			else
				System.out.print("| ");
		}
	}
}