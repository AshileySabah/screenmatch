import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("O Poderoso Chefão");
        filme1.setDuracaoEmMinutos(120);

        Filme filme2 = new Filme();
        filme2.setNome("Em busca da Felicidade");
        filme2.setDuracaoEmMinutos(90);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(filme1);
        calculadora.incluir(filme2);
        System.out.println(String.format("%d minutos (aproximadamente %.2f horas)", calculadora.getTempoTotal(), (float) calculadora.getTempoTotal()/60));;
    }
}
