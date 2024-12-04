package Ejercicio17;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        String espacio = " ";
        char simbolo;
        char vacia;
        boolean SinRelleno;

        SinRelleno = false;
        System.out.println("Introduce la altura de la piramide: ");
        altura = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el caracter con el que deseas rellenarla: ");
        simbolo = sc.next().charAt(0);
        System.out.println("Introduce S (Si) o N (No) Si la quieres vacia");
        vacia = sc.next().charAt(0);
        sc.close();
        if(vacia == 'S')
            SinRelleno = true;
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(espacio);
            }
            if(SinRelleno){
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print(simbolo);
                }
            }else{
                for (int k = 1; k <= i * 2 - 1; k++) {
                    if(k == 1 || k == i * 2 - 1)
                        System.out.print(simbolo);
                    else{
                        System.out.print(espacio);
                    }
                    System.out.println();
                }

            }
            System.out.println();
        }
    }
}

