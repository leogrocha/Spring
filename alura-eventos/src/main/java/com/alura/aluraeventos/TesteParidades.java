package com.alura.aluraeventos;

import java.util.List;

import com.alura.aluraeventos.config.jsonParidades;
import com.alura.aluraeventos.dominio.ListaParidades;
import com.alura.aluraeventos.dominio.Paridades;
import com.alura.aluraeventos.dominio.Producoes;
import com.alura.aluraeventos.dominio.Produtos;
import com.google.gson.Gson;

public class TesteParidades {
    public static void main(String[] args) {
        Gson gson = new Gson();
        jsonParidades json = new jsonParidades();
        // Paridades paridades = new Paridades();
        // paridades = gson.fromJson(json.retornaParidades(), Paridades.class);

        // Gson gson = new Gson();

        // JSONImportado json = new JSONImportado();

        // ListaParidades paridades = new ListaParidades();
        // paridades = gson.fromJson(json.JSONImportacao(), ListaParidades.class);
        // System.out.println(paridades.toString());

        // List<Composicao> listComposicao = new LinkedList<>();
        // Composicao composicao = new Composicao("OPERA", 5.0, 3.0);
        // listComposicao.add(composicao);

        // List<Produtos> listProdutos = new LinkedList<>();
        // Produtos produto1 = new Produtos("COMET", 5.0, 3.0, listComposicao);
        // listProdutos.add(produto1);

        // Producoes producoes = new Producoes("Bourbon", listProdutos);

        // Paridades paridades = new Paridades("BASF", "2023-03-13", producoes);

        ListaParidades paridades3 = new ListaParidades();

        paridades3 = gson.fromJson(json.jsonImportacao(), ListaParidades.class);

        // String paridades2 = gson.toJson(paridades);

        // System.out.println(json.jsonImportacao());

        for (Paridades paridades : paridades3.getParidades()) {
            List<Producoes> producoes = paridades.getProducoes();
            List<List<Produtos>> produtos = producoes.stream()
                    .filter(prod -> prod.getProdutos() != null)
                    .map(prod -> prod.getProdutos()).toList();
            // List<Stream<Composicao>> composicao = paridades.getProducoes().stream()
            //         .flatMap(prod -> prod.getProdutos().stream())
            //         .map(comp -> comp.getComposicao().stream()).toList();

            System.out.println("________________________________________________________________");
            System.out.println("Produções");
            System.out.println(producoes);
            System.out.println("________________________________________________________________");
            System.out.println("Produtos");
            System.out.println(produtos);
            System.out.println("________________________________________________________________");
            System.out.println("Composição");
            // System.out.println(composicao);
            System.out.println("________________________________________________________________");
        }

    }
}
