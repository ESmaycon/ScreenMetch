package br.com.screenmetch.modelos;

import br.com.screenmetch.calculadora.Classificavel;

public class Episodio implements Classificavel {
    private int EpisodioNumero;
    private String nome;
    private Serie serie;
    private int totalDeViws;

    public int getEpisodioNumero() {
        return EpisodioNumero;
    }

    public void setEpisodioNumero(int episodioNumero) {
        EpisodioNumero = episodioNumero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalDeViws >= 100){
            return 4;
        } else{
            return 2;
        }
    }
}
