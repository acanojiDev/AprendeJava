package AprendeJava.CAP6.EjerciciosAvanzados.Ejercicio16;

public class Ejercicio16 {
    private static String elegirFigura(){
        int figura = 0;
        String corazon = "corazon";
        String diamante = "diamante";
        String herradura = "herradura";
        String campana = "campana";
        String limon =  "limón";
        figura = (int)((Math.random()*5) + 1);
        return switch (figura){
            case 1 -> corazon;
            case 2 -> diamante;
            case 3 -> herradura;
            case 4 -> campana;
            case 5 -> limon;
            default-> "";
        };
    }
    public static void main(String[] args) {
        String figura1 = elegirFigura();
        String figura2 = elegirFigura();
        String figura3 = elegirFigura();

        System.out.printf("%s %s %s\n", figura1, figura2, figura3);
        if(figura1.equals(figura2) && figura2.equals(figura3)){
            System.out.print("Enhorabuena, ha ganado 10 monedas");
        }else if(figura1.equals(figura2) || figura1.equals(figura3) || figura2.equals(figura3)){
            System.out.print("Bien, ha recuperado su moneda");
        }else{
            System.out.print("Lo siento, ha perdido");
        }
    }
}