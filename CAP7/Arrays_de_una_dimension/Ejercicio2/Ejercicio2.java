public class Ejercicio2 {
    public static void main(String[] args) {
        char[] simbolo;
        simbolo = new char[10];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';
        for (int i = 0; i < simbolo.length; i++) {
            System.out.printf("simbolo [%d]: %s\n",i,simbolo[i]);
        }
        /*Observamos que al no estar inicializado una posicion automaticamente
        deja un espacio*/
    }
}
