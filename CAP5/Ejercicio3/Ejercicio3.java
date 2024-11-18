package Ejercicio3;

import java.util.Scanner;
public class Ejercicio3 {
    public static int leer(){
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        try {
            numero = Integer.parseInt(sc.nextLine());
            sc.close();
        } catch (NumberFormatException e) {
            System.out.println("Debe introducir un número");
        }
        return numero;
    }
    public static void ejercicio3(){
        long numero;
        int i;
        numero = leer();
        numero = Math.abs(numero);
        i = 0;
        while (numero > 0) {
            numero /= 10;
            i++;
        }
        System.out.printf("El numero introducido tiene %d dígitos\n",i);
    }
    public static void main(String[] args){
        ejercicio3();
    }
}
