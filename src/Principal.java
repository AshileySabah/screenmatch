public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "O Poderoso Chefão";
        filme.anoDeLancamento = 1970;
        filme.inclusoNoPlano = true;
        filme.totalDeAvaliacoes = 399;
        filme.duracaoEmMinutos = 180;

        filme.exibirFichaTecnica();

    }
}
