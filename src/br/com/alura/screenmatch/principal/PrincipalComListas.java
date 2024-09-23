package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O Poderoso Chefão", 2002);
        Filme filme2 = new Filme("Em busca da Felicidade", 2004);
        Serie serie1 = new Serie("Stranger Things", 2019);

        ArrayList<Titulo> lista = new ArrayList<Titulo>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(serie1);

        for (Titulo titulo : lista) {
            if(titulo instanceof Filme filme) {
                System.out.println(filme.getClassificacao());
            }

            System.out.println(titulo);
        }
    }
}
