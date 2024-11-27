public class Ejercicio4 {
    public static void main(String[] args) {
        int numero[];
        int cuadrado[];
        int cubo[];

        numero = new int[20];
        cuadrado = new int[20];
        cubo = new int[20];
        System.out.println("numero   cuadrado   cubo");
        for (int i = 0; i < 19; i++) {
            numero[i] = (int)(Math.random()*100);
            cuadrado[i] = (int)Math.pow(numero[i], 2);
            cubo[i] = (int)Math.pow(numero[i], 3);
            System.out.printf("   %d     %d      %d\n",numero[i], cuadrado[i], cubo[i]);
        }
    }
}
