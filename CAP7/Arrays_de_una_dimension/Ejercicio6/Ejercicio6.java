public class Ejercicio6 {
    public static void main(String[] args) {
        int num[];
        num = new int[15];
        int aux[];
        aux = new int[15];
        System.out.println("Introduzca 15 numeros: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Array modificado");
        for (int i = 0; i < num.length; i++) {
            aux[0] = num[14];
            aux[i] = num[i + 1];
            System.out.println(aux[i]);
        }

    }

}
