package Ejercicio4;
public class Ejercicio4 {
    public static void calcularMedia(){
        int numero = 0;
        int suma = 0;
        int contador = 0;
        Double media = 0.0;
        boolean salir = true;
        System.out.println("Este programa calcula la media de los numeros positivos introducidos.");
        System.out.println("Para parar, introduzca un número negativo.");
        System.out.println("Vaya introduciendo números: ");
        while (salir) {
            numero = Integer.parseInt(System.console().readLine());
            if(numero >= 0){
                suma += numero;
                contador++;
            }else if(numero < 0)
                salir = false;
        }
        media = (double) suma / contador;
        System.out.printf("La media de los numeros es %.2f" ,media);
    }

    public static void main(String[] args) {
        calcularMedia();
    }
}
