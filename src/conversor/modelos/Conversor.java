package src.conversor.modelos;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Conversor {

    private String moneda_base;
    private String moneda_target;

    private String getMoneda_base() {
        return moneda_base;
    }
    private void setMoneda_base(String moneda_base) {
        this.moneda_base = moneda_base;
    }

    private String getMoneda_target() {
        return moneda_target;
    }
    private void setMoneda_target(String moneda_target) {
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
                System.out.println("Opción no encontrada.");
                System.exit(0);
        }
    }


    public void hacerConversion(int opcion, float valor) {
        setearMonedas(opcion);

        String base = getMoneda_base();
        String target = getMoneda_target();

        String url = "https://v6.exchangerate-api.com/v6/efec8497a69ea9a65903843c/pair/"+base+"/"+target+"/"+valor;

        HttpResponse<String> response = null;
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println("Problemas con la solicitud.");;
        }

        assert response != null;
        String json = response.body();

        // Parse the string into a JsonObject
        JsonObject jsonObject = null;
        try {
            jsonObject = JsonParser.parseString(json).getAsJsonObject();
        } catch (JsonSyntaxException e) {
            System.out.println("Error obteniendo los datos.");
        }

        // Get specific value
        assert jsonObject != null;
        float resultado = jsonObject.get("conversion_result").getAsFloat();

        // Print the value
        System.out.println("Resultado: " + resultado);

    }
}
