import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setTemporadas(19);
        lost.exibirFichaTecnica();
    }
}
