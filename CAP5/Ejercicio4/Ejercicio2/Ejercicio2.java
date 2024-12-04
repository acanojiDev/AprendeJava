package Ejercicio2;

import java.util.Scanner;
public class Ejercicio2 {
    public static int leer() {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        while (true) { // Bucle que pide la entrada hasta que se introduce un número válido
            try {
                System.out.print("Introduce un número: ");
                numero = Integer.parseInt(sc.nextLine());
                sc.close();
                return numero; // Sale del método si el número es válido
            } catch (NumberFormatException e) {
                System.out.println("No se ha introducido un número válido. Inténtalo de nuevo.");
            }
        }
    }
    public static void multiplicar(){
        int numero = leer();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n",numero,i,numero * i);
        }
    }
}