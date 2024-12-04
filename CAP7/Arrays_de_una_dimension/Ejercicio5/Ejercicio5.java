public class Ejercicio5 {
    public static void main(String[] args) {
        int numeros[] = new int[10];

        System.out.println("Introduzca 10 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        int maximo = numeros[0];
        int minimo = numeros[0];
        for (int numero : numeros) {
            if(maximo < numero){
                maximo = numero;
            }else if(numero < minimo){
                minimo = numero;
            }
        }
        System.out.println();
        for (int numero : numeros) {
            if(numero == minimo)
                System.out.println(numero + " minimo");
            else if(numero == maximo)
                System.out.println(numero + " maximo");
            else
                System.out.println(numero);
        }
    }
}
