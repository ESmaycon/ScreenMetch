package br.com.screenmetch.calculadora;
import br.com.screenmetch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal+= titulo.getDuracaoEmMinitos();
    }
}
