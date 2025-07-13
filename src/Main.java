package src;
import src.conversor.modelos.*;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Conversor conversor = new Conversor();

        menu.showMenu();

        int opcion = menu.getOpcion();
        float valor = menu.getValor();

        conversor.hacerConversion(opcion, valor);
    }
}
