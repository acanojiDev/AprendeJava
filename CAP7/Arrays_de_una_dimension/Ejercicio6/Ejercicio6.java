public class Ejercicio6 {

    public static void rotarDerecha(int num[]){
        //Paso 1. Guardamos el último elemento
        int ultimo = num[num.length - 1];

        //Paso 2. Desplazamos elementos hacia la derecha
        for (int i = num.length - 1; i > 0; i--) {
            num[i] = num[i - 1];
        }

        //Paso 3. Colocar el último elemento en la primera posicion
        num[0] = ultimo;
    }

    public static void imprimirArray(int num[]){
        for (int arr : num) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println("Antes de la rotación:");
        imprimirArray(num);
        rotarDerecha(num);
        System.out.println("Después de la rotación:");
        imprimirArray(num);
    }

}
