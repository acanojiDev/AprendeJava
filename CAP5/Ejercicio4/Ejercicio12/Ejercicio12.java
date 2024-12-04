package Ejercicio12;

import java.net.ContentHandler;

public class Ejercicio12 {
    public static void calcular(int numero, int numeroPosicion){

    }
    public static void main(String[] args) {
        Double numerodividir;
        int numero, numeroPosicion, contador, numeroABuscar;
        contador = 0;
        System.out.println("Introduce numero: ");
        numero = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce el numero a buscar: ");
        numeroABuscar = Integer.parseInt(System.console().readLine());
        //Calculo longitud
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        /*Una vez que se cuantos digitos tiene el numero elevo 10 a las veces que he podido dividir el numero
         * y lo voy decrementando y cuando el numero coincidida con numeroAEncontrar devuelvo posicion
        */
        while (numero != 0){
            numerodividir = Math.pow(10, contador);
            numero /= numerodividir;
            if(numero == numeroABuscar)
                System.out.println(contador);
            contador--;
        }
    }
}
