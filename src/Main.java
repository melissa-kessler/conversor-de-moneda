package src;
import src.conversor.modelos.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
        menu.preguntarOpcion();
    }
}
