package com.alura.aluraeventos.dominio;

import java.util.List;

public class Produtos {
    private String descricao;
    private Double embalagem;
    private Double valor;
    private List<Composicao> composicao;

    public Produtos(String descricao, Double embalagem, Double valor, List<Composicao> composicao) {
        this.descricao = descricao;
        this.embalagem = embalagem;
        this.valor = valor;
        this.composicao = composicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getEmbalagem() {
        return embalagem;
    }

    public Double getValor() {
        return valor;
    }

    public List<Composicao> getComposicao() {
        return composicao;
    }

    @Override
    public String toString() {
        return "Produtos [descricao=" + descricao + ", embalagem=" + embalagem + ", valor=" + valor + ", composicao="
                + composicao + "]";
    }

    

    
}
