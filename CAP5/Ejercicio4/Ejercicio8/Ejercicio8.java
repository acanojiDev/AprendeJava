package Ejercicio8;

public class Ejercicio8 {
    public static boolean esPrimo(int valor){
        boolean _esPrimo;
        _esPrimo = true;
        for (int i = 2; i < valor / 2; i++) {
            if(valor % i == 0){
                _esPrimo = false;
                break;
            }
        }
        return _esPrimo;
    }
 
    
    public static void main(String[] args) 
    {
        System.out.println("Numeros primos entre 2 y 100: ");
        for (int i = 2; i <= 100; i++) {
            if(esPrimo(i))
                System.out.printf("%d ",i);
        }
    }
}