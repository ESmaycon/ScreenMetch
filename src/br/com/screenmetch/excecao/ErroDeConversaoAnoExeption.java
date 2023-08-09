package br.com.screenmetch.excecao;

public class ErroDeConversaoAnoExeption extends RuntimeException {

    private String menssagem;
    public ErroDeConversaoAnoExeption(String menssagem) {
        this.menssagem = menssagem;
    }

    @Override
    public String getMessage() {
        return this.menssagem;
    }
}
