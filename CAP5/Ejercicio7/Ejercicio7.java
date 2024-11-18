package Ejercicio7;

public class Ejercicio7 {
    public static void pedirDatos(){
        int numero = 0;
        int suma = 0;
        int contador = 0;
        Double mediaImpares = 0.0;
        int maxPar = 0;
        boolean salir = true;
        System.out.println("Por favor, vaya introduciendo números enteros.");
        System.out.println("Puede terminar mediante la introducción de un número negativo");
        while (salir) {
            numero = Integer.parseInt(System.console().readLine());
            if(numero >= 0 && numero % 2 != 0){
                suma += numero;
                contador ++;
            }else if(numero >= 0 && numero % 2 == 0){
                maxPar = numero;
                if (numero > maxPar) {
                    maxPar = numero;
                }
            }else
                salir = false;
        }
        mediaImpares = (double) (suma / contador);
        System.out.printf("Ha introducido %d números positivos\n",contador);
        System.out.printf("La media de los numeros impares es %.2f\n" ,mediaImpares);
        System.out.printf("El máximo de los pares es %d\n",maxPar);
    }
}
