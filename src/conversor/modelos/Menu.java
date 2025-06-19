package src.conversor.modelos;

public class Menu {

    private int opcion = 7;

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public static void mostrarMenu() {
        System.out.println("""
                Bienvenido/a al Conversor de Moneda.
                
                Elija una opción válida:
                
                1) Dólar -> Peso argentino
                2) Peso argentino -> Dólar
                3) Dólar -> Real brasileño
                4) Real brasileño -> Dólar
                5) Dólar -> Peso colombiano
                6) Peso colombiano -> Dólar
                7) Salir
                
                """);
    }


}