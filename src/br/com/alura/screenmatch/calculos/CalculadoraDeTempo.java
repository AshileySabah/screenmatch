package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal;

    // getters
    public int getTempoTotal() {
        return tempoTotal;
    }

    // métodos
    public void incluir(Filme filme){
        tempoTotal += filme.getDuracaoEmMinutos();
    }
}
