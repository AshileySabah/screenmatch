package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O Poderoso Chefão", 2002);
        Filme filme2 = new Filme("Em busca da Felicidade", 2004);
        Serie serie1 = new Serie("Stranger Things", 2019);

        ArrayList<Titulo> filmes = new ArrayList<Titulo>();
        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(serie1);

        for (Titulo titulo : filmes) {
            if(titulo instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao() + " - " + filme.getNome());
            }
            System.out.println(titulo);
        }

        ArrayList<String> atores = new ArrayList<String>();
        atores.add("Sandra Bullock");
        atores.add("Anne Hathaway");
        atores.add("Bruno Gagliasso");
        System.out.println(atores);
        Collections.sort(atores);
        System.out.println(atores);

        Collections.sort(filmes);
        System.out.println(filmes);
    }
}
