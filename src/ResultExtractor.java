import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

class ResultExtractor {
    public String extract(String jsonResponse, String toCurrency, double cantidad) {
        JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
        JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");
        JsonElement element = rates.get(toCurrency);
        if (element == null || element.isJsonNull()) {
            throw new IllegalArgumentException("La clave " + toCurrency + " está ausente en el objeto JSON");
        }
        double rate = element.getAsDouble();
        return Double.toString(cantidad * rate);
    }
}
