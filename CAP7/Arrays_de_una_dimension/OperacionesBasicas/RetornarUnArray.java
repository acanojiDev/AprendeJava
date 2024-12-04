package OperacionesBasicas;

public class RetornarUnArray {
	public static int[] crearArray(){
		return new int[] {1,2,3,4,5};
	}
	public static void main(String[] args) {
		int[] resultado = crearArray();
		for (int numero : resultado) {
			System.out.println(numero);
		}
	}
}
