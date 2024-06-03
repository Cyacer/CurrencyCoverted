import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {
  private static final String API_URL = "https://v6.exchangerate-api.com/v6/7f11e03130105dece1808254/latest/USD";

    public ConversionRates getConversionRates(String baseCurrency) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL.replace("USD", baseCurrency)))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            return gson.fromJson(response.body(), ConversionRates.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
