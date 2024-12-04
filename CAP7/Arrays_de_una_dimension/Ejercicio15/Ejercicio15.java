public class Ejercicio15 {
	public static int[] generarHuecos(){
		int[] personas = new int[10];
		for (int i = 0; i < personas.length; i++) {
			personas[i] = (int)(Math.random()*5);
		}
		return personas;
	}
	public static void generarMesas(int[] huecos){
		int[] arrayHuecos = generarHuecos();
		System.out.print("Mesa nº   | ");
		for (int i = 0; i < arrayHuecos.length; i++) {
			System.out.printf("%-3d",i);
		}
		System.out.println();
		System.out.print("Ocupacion | ");
		for (int hueco : arrayHuecos) {
			System.out.printf("%-3d",hueco);
		}
	}

	public static int leerClientes(){
        System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
        int personas = Integer.parseInt(System.console().readLine());
        if (personas > 4 || personas < -1) {
            System.out.println("Lo sentimos, no admitimos grupos mayores de 4. Intente de nuevo.");
            return -1;
        }
        return personas;
	}

    public static void buscarHueco(int[] huecos) {
        while (true) {
            int clientes = leerClientes();
            if (clientes == -1) {
                System.out.println("Saliendo del programa. ¡Gracias!");
                break;
            }

            boolean huecoEncontrado = false;

            for (int i = 0; i < huecos.length; i++) {
                if (huecos[i] + clientes <= 4) { // Verificar si hay espacio suficiente
                    System.out.printf("Por favor, siéntese en la mesa número %d.%n", i);
                    huecos[i] += clientes; // Actualizar ocupación de la mesa
                    huecoEncontrado = true;
                    break;
                }
            }

            if (!huecoEncontrado) {
                System.out.println("Lo sentimos, no hay mesas disponibles para su grupo en este momento.");
            }

            generarMesas(huecos);// Mostrar estado actualizado de las mesas
        }
    }
    public static void main(String[] args) {
		int[] mesas = generarHuecos();
        generarMesas(mesas);
        buscarHueco(mesas);
	}
}
