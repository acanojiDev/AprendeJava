public class Ejercicio14 {
	public static String[] leer(){
		String[] palabras = new String[8];
		System.out.println("Introduzca 8 palabras (vaya pulsando [INTRO] entre una y otra)");
		for (int i = 0; i < palabras.length; i++) {
			palabras[i] = System.console().readLine();
		}
		return palabras;
	}
	public static String[] coloresTotal(){
		final String[] colores = {"azul","negro","rojo","verde","amarillo",
		"naranja","blanco","morado","celeste","gris","lima","marrón","rosa",
		"pistacho","mostaza"};
		return colores;
	}
	public static void generarArrayOriginal(){
		String[] palabras = leer();
		System.out.print("Índice ");
		for (int i = 0; i < palabras.length; i++) {
			System.out.printf("%-6d ", i);
		}
		System.out.println();
		System.out.print("Valor ");
		for (int i = 0; i < palabras.length; i++) {
			System.out.printf("%-6s ", palabras[i]);
		}
		System.out.println();
	}

	public static void Clasificar(){
		//Arreglar
	}
	public static void main(String[] args) {
		Clasificar();
	}
}
