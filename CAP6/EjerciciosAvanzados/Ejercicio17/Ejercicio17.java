package AprendeJava.CAP6.EjerciciosAvanzados.Ejercicio17;

public class Ejercicio17 {
    /**Realiza un programa que pinte por pantalla una pecera con un pececito dentro. Se debe pedir al usuario el
    ancho y el alto de la pecera, que como mínimo serán de 4 unidades. No hay que comprobar que los datos
    se introducen correctamente; podemos suponer que el usuario los introduce bien. Dentro de la pecera hay
    que colocar de forma aleatoria un pececito, que puede estar situado en cualquiera de las posiciones que
    quedan en el hueco que forma el rectángulo.
    Ejemplo 1:
    Por favor, introduzca la altura de la pecera (como mínimo 4): 4
    Ahora introduzca la anchura (como mínimo 4): 7 */
    public static void main(String[] args) {
        int altura;
        int anchura;
        int X;
        int Y;
        System.out.println("Introduzca la altura de la pecera: (como minimo 4)");
        altura = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca una anchura de la pecera: (como minimo 4)");
        anchura = Integer.parseInt(System.console().readLine());
        X = (int)((Math.random()* (altura - 2)*(anchura - 2)));
        Y = (int)((Math.random()*(altura - 2)*(anchura - 2)));
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= anchura; j++) {
                if(i == 1 || i == altura || j == 1 || j == anchura){
                    System.out.print("*");
                }else if(i == X && j == Y){
                    System.out.print("&");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
