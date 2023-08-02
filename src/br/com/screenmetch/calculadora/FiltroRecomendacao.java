package br.com.screenmetch.calculadora;
import br.com.screenmetch.modelos.Filme;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4 ) {
            System.out.println("Está entre os melhores avaliados");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Bem avaliado nos ultimos dias");
        } else {
            System.out.println("Ótimo titulo para assisitir");
        }
    }
}
