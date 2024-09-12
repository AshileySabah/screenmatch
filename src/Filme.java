public class Filme {
    String nome;
    int anoDeLancamento;
    boolean inclusoNoPlano;
    double totalAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibirFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avaliar(double nota){
        totalAvaliacoes += nota;
    }
}
