import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

class ConsultaCep {
    public Endereco buscaEndereco(String cep) throws IOException, InterruptedException {
        String url = "https://viacep.com.br/ws/" + cep + "/json";
        URI endereco = URI.create(url);

        HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco)
            .GET()
            .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String responseBody = response.body();

        // Verifica se o CEP é inválido (contém "erro": true)
        JsonObject jsonObject = new Gson().fromJson(responseBody, JsonObject.class);
        if (jsonObject.has("erro") && jsonObject.get("erro").getAsBoolean()) {
            throw new RuntimeException("CEP não encontrado: " + cep);
        }

        // Converte o JSON para o objeto Endereco
        return new Gson().fromJson(responseBody, Endereco.class);
    }
}
