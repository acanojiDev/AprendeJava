package  Ejercicio1;
public class Ejercicio1{
    public static int leer(int codigo){
        return codigo = Integer.parseInt(System.console().readLine());
    }
    public static void pedirClave(){
        int codigo;
        int intentos;
        boolean salir;

        codigo = 2133;
        intentos = 4;
        salir = false;
        try {
            while (intentos > 0 && !salir) {
                System.out.println("Introduzca la clave de la caja fuerte: ");
                codigo = leer(codigo);
                if (codigo!= 2133) {
                    System.out.println("Clave incorrecta.");
                    intentos--;
                }else{
                    System.out.println("Ha abierto la caja fuerte.");
                    salir = true;
                }
            }
            if(intentos == 0){
                System.out.println("Lo siento, ha agotado las 4 oportunidades.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Porfavor la clave solo dispone de caracteres númericos.");
        } catch (Exception e){
            System.out.println("Error.");
        }
    }
}