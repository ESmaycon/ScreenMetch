package br.com.screenmetch.principal;

import br.com.screenmetch.excecao.ErroDeConversaoAnoExeption;
import br.com.screenmetch.modelos.Titulo;
import br.com.screenmetch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual Título deseja buscar? ");
        var busca = leitura.nextLine();
        try {
        String chave = "78b521f";
        String endereco = "https://www.omdbapi.com/?t="+ busca +"&apikey="+ chave;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        TituloOmdb meuTituloOmdb = gson.fromJson(json,TituloOmdb.class) ;
        System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println(meuTitulo);
        } catch (NumberFormatException e){
            System.out.println("ERRO: " + e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        } catch (ErroDeConversaoAnoExeption e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finalizado...");
        }


    }
}
