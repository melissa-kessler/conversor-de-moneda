package src;
import src.conversor.modelos.Conversor;
import src.conversor.modelos.Menu;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Menu menu = new Menu();
        Conversor conversor = new Conversor();

        menu.showMenu();

        int opcion = menu.getOpcion();
        int valor = menu.getValor();

        conversor.hacerConversion(opcion, valor);
    }
}
