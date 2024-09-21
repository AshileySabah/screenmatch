package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean inclusoNoPlano;
    private int totalDeAvaliacoes;
    private double somaDasAvaliacoes;
    private int duracaoEmMinutos;

    // métodos
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

    // getters
    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public boolean isInclusoNoPlano() {
        return inclusoNoPlano;
    }
    
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
