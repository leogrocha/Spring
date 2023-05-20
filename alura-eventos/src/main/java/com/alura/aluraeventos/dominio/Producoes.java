package com.alura.aluraeventos.dominio;

import java.util.List;

public class Producoes {
    private String producao;
    private List<Produtos> produtos;
    
    public Producoes(String producao, List<Produtos> produtos) {
        this.producao = producao;
        this.produtos = produtos;
    }

    public String getProducao() {
        return producao;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "Producoes [producao=" + producao + ", produtos=" + produtos + "]";
    }
    
}
