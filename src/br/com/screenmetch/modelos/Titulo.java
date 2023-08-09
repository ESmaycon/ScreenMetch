package br.com.screenmetch.modelos;

import br.com.screenmetch.excecao.ErroDeConversaoAnoExeption;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean tipoConta;
    private double somaDasAvaliacao;
    private int quatidadeAvaliacao;
    private int duracaoEmMinitos;

    public Titulo (String nome, int anoDeLancamento){
        setNome(nome);
        setAnoDeLancamento(anoDeLancamento);
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoAnoExeption("Error: não consegui converter o ano " +
                    "pois tem mais que 4 carateres. ");
        }

        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinitos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public int getQuatidadeAvaliacao() {
        return quatidadeAvaliacao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isTipoConta() {
        return tipoConta;
    }

    public int  getDuracaoEmMinitos() {
        return duracaoEmMinitos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setTipoConta(boolean tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setDuracaoEmMinitos(int duracaoEmMinitos) {
        this.duracaoEmMinitos = duracaoEmMinitos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do br.com.screenmetch.modelos.Filme: "+nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração do filme: " + duracaoEmMinitos +"min");
        System.out.println("Incluído no plano: "+ tipoConta);
    }

    public void avaliacao(double nota){
        somaDasAvaliacao += nota;
        quatidadeAvaliacao++;
    }

    public double pegarMedia(){
        return somaDasAvaliacao / quatidadeAvaliacao;
    }
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo: " + nome +
                ", ano De Lancamento: " + anoDeLancamento +
                ", Duração: " + duracaoEmMinitos;
    }
}
