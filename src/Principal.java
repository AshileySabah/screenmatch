import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("O Poderoso Chefão");
        filme1.setDuracaoEmMinutos(120);

        Filme filme2 = new Filme();
        filme2.setNome("Em busca da Felicidade");
        filme2.setDuracaoEmMinutos(90);

        Serie serie1 = new Serie();
        serie1.setNome("Stranger Things");
        serie1.setTemporadas(4);
        serie1.setEpisodiosPorTemporada(8);
        serie1.setMinutosPorEpisodio(45);
        

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(filme1);
        calculadora.incluir(filme2);
        calculadora.incluir(serie1);
        System.out.println(String.format("%d minutos (aproximadamente %.2f horas)", calculadora.getTempoTotal(), (float) calculadora.getTempoTotal()/60));;

        FiltroRecomendacao filtroFilme = new FiltroRecomendacao();
        filtroFilme.filtrar(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacoes(300);

        FiltroRecomendacao filtroEpsodio = new FiltroRecomendacao();
        filtroEpsodio.filtrar(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<Filme>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        System.out.println(listaDeFilmes.size());

        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Segundo filme: " + listaDeFilmes.get(1).getNome());
        System.out.println(listaDeFilmes);
    }
}
