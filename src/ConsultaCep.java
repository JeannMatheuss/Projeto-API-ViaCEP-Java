import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class ConsultaCep {
    
    public Endereco buscaEndereco(String cep) throws IOException, InterruptedException {
        URI endereco = URI.create("viacep.com.br/ws/" + cep + "/json");
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco)
            .build();

        HttpResponse<String> response = 
        try {HttpClient
            .newHttpClient()
            .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não foi possível achar o endereço com esse CEP.");
        }

        return new Gson().fromJson(response.body(), Endereco.class);
    }
}
