import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("O Poderoso Chefão");
        filme.setAnoDeLancamento(1970);
        filme.setInclusoNoPlano(true);
        filme.setDuracaoEmMinutos(180);

        filme.exibirFichaTecnica();

        filme.avaliar(8.1);
        filme.avaliar(9.2);

        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
    }
}
