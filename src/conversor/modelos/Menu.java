package src.conversor.modelos;
import java.util.Scanner;

public class Menu {

    private int opcion = 7;
    private int valor = 1;

    public int getValor() {
        return valor;
    }

    private void setValor(int valor) {
        this.valor = valor;
    }

    public int getOpcion() {
        return opcion;
    }

    private void setOpcion(int opcion) {
        this.opcion = opcion;
    }


    public void showMenu() {
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

        Scanner scanner = new Scanner(System.in);

        pedirOpcion(scanner);

        pedirValor(scanner);

    }


    public void pedirOpcion(Scanner scanner) {
        boolean isValid = false;
        int respuesta = 0;
        while (!isValid) {
            System.out.print("Ingrese una opción válida: ");
            respuesta = scanner.nextInt();
            isValid = validarOpcion(respuesta);
        }
        setOpcion(respuesta);
    }

    public boolean validarOpcion(int opcion) {
        if (opcion == 7) {
            System.out.println("¡Hasta pronto!");
            System.exit(0);
        }
        return opcion >= 1 && opcion <= 6;
    }


    public void pedirValor(Scanner scanner) {
        System.out.print("Ingrese el valor a convertir: ");
        int respuesta = scanner.nextInt();
        setValor(respuesta);
    }

}