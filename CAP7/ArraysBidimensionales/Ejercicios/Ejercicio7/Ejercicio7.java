package ArraysBidimensionales.Ejercicios.Ejercicio7;

public class Ejercicio7 {
	public static int pedirCoordenadasX(){
		int coordenadaX;
		System.out.println("Coordenada x:");
		coordenadaX = Integer.parseInt(System.console().readLine());
		return coordenadaX;
	}
	public static int pedirCoordenadasY(){
		int coordenadaY;
		System.out.println("Coordenada y:");
		coordenadaY = Integer.parseInt(System.console().readLine());
		return coordenadaY;
	}

	public static int[][] rellenarMatrizRandom(){
		int[][] matriz = new int[4][5];
		String[][] matrizMapa = new String[4][5];
		for (int i = 0; i < matriz.length; i++) {
			int countTesoro = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				if (countTesoro < 1 && Math.random() < 0.1) {
					matriz[i][j] = 2;
					countTesoro++;
				} else if (Math.random() < 0.3) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
				switch (matriz[i][j]) {
					case 0:
						matrizMapa[i][j] = " ";
						break;
					case 1:
						matrizMapa[i][j] = "*";
						break;
					case 2:
						matrizMapa[i][j] = "€";
					default:
						break;
				}
			}
		}
		return matriz;
	}

	public static void main(String[] args) {
	
	}
}
