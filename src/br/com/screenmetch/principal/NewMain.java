package br.com.screenmetch.principal;

import br.com.screenmetch.modelos.Filme;
import br.com.screenmetch.modelos.Serie;
import br.com.screenmetch.modelos.Titulo;

import java.util.*;

public class NewMain {
    public static void main(String[] args) {
        Filme filme = new Filme("Sonic", 2022);
        filme.avaliacao(7);
        Filme filme2 = new Filme("Vingadores", 2022);
        filme2.avaliacao(9);
        Filme filme3 = new Filme("Homem-Aranha", 2022);
        filme3.avaliacao(10);
        Serie serie = new Serie("Lost", 2000);
        serie.avaliacao(8);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filmes && filmes.getClassificacao() > 2){
                System.out.println("Classificção: " + filmes.getClassificacao());
            }

        }

        List<String> buscarPorArtista = new LinkedList<>();
        buscarPorArtista.add("Leleco");
        buscarPorArtista.add("Fuleco");
        buscarPorArtista.add("Beltrano");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println(buscarPorArtista);

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("");
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
