package src.conversor.modelos;
import java.util.Scanner;

public class Menu {

    private int opcion = 7;

    public int getOpcion() {
        return opcion;
    }

    private void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public static void mostrarMenu() {
        System.out.println("""
                Bienvenido/a al Conversor de Moneda.
                
                Las opciones de conversión son:
                
                1) Dólar -> Peso argentino
                2) Peso argentino -> Dólar
                3) Dólar -> Real brasileño
                4) Real brasileño -> Dólar
                5) Dólar -> Peso colombiano
                6) Peso colombiano -> Dólar
                7) Salir
                
                """);
    }

    public void preguntarOpcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una opción válida: ");
        int opcion = scanner.nextInt();
        setOpcion(opcion);
    }
}