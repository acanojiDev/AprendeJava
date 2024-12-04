package OperacionesBasicas;

import java.util.Arrays;;

public class ArraySort {
	public static void main(String[] args) {
		int[] numeros = {79,20,331,54,50};
		Arrays.sort(numeros);

		System.out.println("Array ordenado: ");
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}
}
