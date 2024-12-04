package Ejercicio10;

public class Ejercicio10 {
    public static String BucleNumerico(int fila){
        String resultado = "";
        int valor = 1;
        for (int i = 1; i <= 2 * fila - 1; i++) {
            resultado += "" +valor;
            if(i > (2 * fila - 1) / 2)
                valor --;
            else
                valor ++;
        }
        return resultado;
    }

    public static void hazPiramide(){
        int altura;

        System.out.println("Introduzca la altura: ");
        altura = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura + i - 1; j++) {
            if (j <= altura - i) {
                System.out.print(" ");
            } else {
                BucleNumerico(i);
            }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hazPiramide();
    }
}
