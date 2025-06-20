package src.conversor.modelos;

public class Conversor {

    private String moneda_base;
    private String moneda_target;

    public String getMoneda_base() {
        return moneda_base;
    }
    public void setMoneda_base(String moneda_base) {
        this.moneda_base = moneda_base;
    }

    public String getMoneda_target() {
        return moneda_target;
    }
    public void setMoneda_target(String moneda_target) {
        this.moneda_target = moneda_target;
    }


    private void setearMonedas(int opcion) {
        switch (opcion) {
            case 1:
                setMoneda_base("USD");
                setMoneda_target("ARS");
                break;
            case 2:
                setMoneda_base("ARS");
                setMoneda_target("USD");
                break;
            case 3:
                setMoneda_base("USD");
                setMoneda_target("BRL");
                break;
            case 4:
                setMoneda_base("BRL");
                setMoneda_target("USD");
                break;
            case 5:
                setMoneda_base("USD");
                setMoneda_target("COP");
                break;
            case 6:
                setMoneda_base("COP");
                setMoneda_target("USD");
                break;
            default:
                System.out.println("¡Hasta pronto!");
                System.exit(0);
        }
    }


    public void hacerConversion(int opcion, int valor) {
        setearMonedas(opcion);
    }
}
