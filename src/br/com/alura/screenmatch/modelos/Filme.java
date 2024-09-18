package br.com.alura.screenmatch.modelos;

public class Filme {
    public String nome;
    public int anoDeLancamento;
    public boolean inclusoNoPlano;
    private int totalDeAvaliacoes;
    private double somaDasAvaliacoes;
    public int duracaoEmMinutos;

    public void exibirFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avaliar(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegarMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    public int pegarTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
}
