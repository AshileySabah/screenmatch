public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "O Poderoso Chefão";
        filme.anoDeLancamento = 1970;
        filme.inclusoNoPlano = true;
        filme.duracaoEmMinutos = 180;

        filme.exibirFichaTecnica();

        filme.avaliar(8.1);
        filme.avaliar(9.2);

        System.out.println("Total de avaliações: " + filme.pegarTotalDeAvaliacoes());

    }
}
