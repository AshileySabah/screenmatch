package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    // getters
    public int getTempoTotal() {
        return tempoTotal;
    }

    // métodos
    public void incluir(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
