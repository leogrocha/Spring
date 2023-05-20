package com.alura.aluraeventos.dominio;

public class Composicao {
    private String descricao;
    private Double embalagem;
    private Double dose;

    public Composicao(String descricao, Double embalagem, Double dose) {
        this.descricao = descricao;
        this.embalagem = embalagem;
        this.dose = dose;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getEmbalagem() {
        return embalagem;
    }

    public Double getDose() {
        return dose;
    }

    @Override
    public String toString() {
        return "Composicao [descricao=" + descricao + ", embalagem=" + embalagem + ", dose=" + dose + "]";
    }

    
}
