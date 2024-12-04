package Ejercicio5;

public class Ejercicio5 {

    public static void pedirDatos(){
        boolean esHueca = true;
        System.out.println("Introduzca la altura de la piramide: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca el simbolo con el que va a ser pintada: ");
        char simbolo = System.console().readLine().charAt(0);
        System.out.println("Introduzca si va a ser rellena o hueca: (s/n)");
        char relleno = System.console().readLine().charAt(0);
        if(Character.toLowerCase(relleno) == 's')
            esHueca = true;
        else
            esHueca = false;
    }
    public static void hacerPiramide(){
        int altura = 5;
        boolean esHueca = true; // This should be set based on user input in pedirDatos
        String simbolo = "* "; // This should be set based on user input in pedirDatos
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura * 2 - 1; j++) {
                if (j < altura - i) {
                    System.out.print("  ");
                } else {
                    System.out.print(simbolo);
                }
            }
            System.out.println();
        }
    }
}
