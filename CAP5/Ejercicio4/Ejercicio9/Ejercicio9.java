package Ejercicio9;

public class Ejercicio9 {
    public static void ejercicio9(){
        int numero = 0;
        int suma = 0;
        int i = 0;
        Double media;
        boolean salir = true;

        System.out.println("Por favor, vaya introduciendo números.");
        System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
        while (salir) {
            if (numero <= 10000 && suma <= 10000) {
                numero = Integer.parseInt(System.console().readLine());
                suma += numero;
                i++;
            }else if(suma > 10000){
                salir = false;
            }
        }
        media = (double)suma / i;
        System.out.printf("Ha introducido un total de %d números\n",i);
        System.out.printf("La suma total es %d\n",suma);
        System.out.printf("La media es %.8f\n",media);
    }
}
