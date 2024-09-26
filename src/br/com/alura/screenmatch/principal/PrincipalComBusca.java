package br.com.alura.screenmatch.principal;

import java.io.FileWriter; 
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.excecoes.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;

public class PrincipalComBusca {
    public static void main (String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<Titulo>();
        
        Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .setPrettyPrinting()
        .create();
        
        while (!busca.equalsIgnoreCase("sair")) {
            // Entrada  busca título
            System.out.println("Digite um filme para a busca: ");
            busca = scanner.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

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

                TituloOmdb tituloOmbd = gson.fromJson(json, TituloOmdb.class);
                System.out.println(tituloOmbd);
                
                Titulo titulo = new Titulo(tituloOmbd);
                System.out.println(titulo);

                titulos.add(titulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Houve um problema com o nome digitado, confira novamente.");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(titulos);

        // Criar Json do Títulos
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

        System.out.println("O programa finalizou.");

        scanner.close();
    }
}