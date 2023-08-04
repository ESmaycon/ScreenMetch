import br.com.screenmetch.calculadora.CalculadoraDeTempo;
import br.com.screenmetch.calculadora.FiltroRecomendacao;
import br.com.screenmetch.modelos.Filme;
import br.com.screenmetch.modelos.Serie;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Scanner leitor = new Scanner(System.in);
        Filme meuFilme = new Filme();
        meuFilme.setNome("Sonic");
        meuFilme.setAnoDeLancamento(2022);
        meuFilme.setDuracaoEmMinitos(180);
        meuFilme.setTipoConta(true);

        meuFilme.exibeFichaTecnica();

        meuFilme.avaliacao(8);
        meuFilme.avaliacao(10);
        meuFilme.avaliacao(9);
        System.out.println(meuFilme.getQuatidadeAvaliacao());
        System.out.println(meuFilme.pegarMedia());

        System.out.println("Média de avaliações do filme: " + meuFilme.pegarMedia());

        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setNumeroDeEpisodios(10);
        lost.setNumeroDeTemporadas(15);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração em minuitos: "+ lost.getDuracaoEmMinitos()+"min");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(lost);
        calculadora.inclui(meuFilme);
        System.out.println("O tempo total para ver esses 2 Titulos são:"+ calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        var novoFilme = new Filme();
        novoFilme.setNome("Vingadores:");
        novoFilme.setAnoDeLancamento(2022);

        ArrayList<Filme> meusFilmes = new ArrayList<>();
        meusFilmes.add(meuFilme);
        meusFilmes.add(novoFilme);
        System.out.println("***********************************************************************************");
        System.out.println("Numero de filmes: " + meusFilmes.size());
        System.out.println("O primeiro Filme é: " + meusFilmes.get(0).getNome());
        System.out.println(meusFilmes);
    }
}
