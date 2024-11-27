public class Ejercicio3 {
    public static void main(String[] args) {
        int num[];
        num = new int[10];
        System.out.println("Vaya introduciendo numeros: ");
        for (int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
        }
        for (int i = num.length - 1; i > 0; i--) {
            System.out.printf("num [%d]: %d\n", i, num[i]);
        }
    }
}
