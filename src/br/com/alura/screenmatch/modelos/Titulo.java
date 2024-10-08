package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecoes.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean inclusoNoPlano;
    private int totalDeAvaliacoes;
    private double somaDasAvaliacoes;
    private int duracaoEmMinutos;

    // construtor
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb tituloOmdb) {
        this.nome = tituloOmdb.title();

        if(tituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Erro ao converter o ano, pois esta informação veio com mais de 4 caracteres.");
        }

        this.anoDeLancamento = Integer.valueOf(tituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(tituloOmdb.runtime().substring(0, 3));
    }

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

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +
        " - Ano de Lançamento: " + this.anoDeLancamento +
        " - Duração (min): " + this.duracaoEmMinutos;
    }
}
