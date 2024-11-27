public class Ejercicio5 {
    public static void main(String[] args) {
        int num[];
        int maximo;

        num = new int[10];
        maximo = 0;
        System.out.println("Introduzca 10 números: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
            if(maximo < num[i])
                maximo = num[i];
        }
        System.out.printf("El maximo valor introducido es %d",maximo);
    }
}
