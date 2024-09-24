package br.com.alura.screenmatch.principal;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;

public class PrincipalComBusca {
    public static void main (String[] args) throws IOException, InterruptedException {
        // Entrada  busca título
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um filme para a busca: ");
        String busca = scanner.nextLine();

        // Consumo
        String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=6585022c";

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Manipular JSON
            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .create();

            TituloOmdb tituloOmbd = gson.fromJson(json, TituloOmdb.class);
            System.out.println(tituloOmbd);
            
            Titulo titulo = new Titulo(tituloOmbd);
            System.out.println(titulo);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Houve um problema com o nome digitado, confira novamente.");
        }

        System.out.println("O programa finalizou.");

        scanner.close();
    }
}