public class Filme {
    String nome;
    int anoDeLancamento;
    boolean inclusoNoPlano;
    private int totalDeAvaliacoes;
    private double somaDasAvaliacoes;
    int duracaoEmMinutos;

    void exibirFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avaliar(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegarMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    int pegarTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
}
