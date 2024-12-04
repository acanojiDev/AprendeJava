package OperacionesBasicas;

public class BuscarUnElemento {
	public static void main(String[] args) {
		int[] numeros = {10,20,30,40,50};
		int buscar = 30;
		int contador = 0;
		boolean encontrado = false;
		for (int numero : numeros) {
			if(buscar == numero){
				encontrado  = true;
				break;
			}
			contador++;
		}
		if(encontrado){
			System.out.printf("El numero %d se ecneuntra en el array en la posicion %d",buscar, contador);
		}else{
			System.out.printf("El numero %d no se ecneuntra en el array",buscar);
		}
	}
}
