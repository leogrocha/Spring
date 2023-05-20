package com.alura.aluraeventos.dominio;

import java.util.List;

public class Paridades {
    private String tabela;
    private String validade;
    private List<Producoes> producoes;

    public Paridades(String tabela, String validade, List<Producoes> producoes) {
        this.tabela = tabela;
        this.validade = validade;
        this.producoes = producoes;
    }

    public Paridades() {
        
    }

    public String getTabela() {
        return tabela;
    }

    public String getValidade() {
        return validade;
    }

    public List<Producoes> getProducoes() {
        return producoes;
    }

    @Override
    public String toString() {
        return "Paridades [tabela=" + tabela + ", validade=" + validade + ", producoes=" + producoes + "]";
    }

    
}
