package com.alura.alurabank.dominio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovimentacaoDeConta {
    
    @JsonProperty
    private ContaCorrente conta;

    @JsonProperty
    private BigDecimal valor;
    
    @JsonProperty
    private int operacao;

    public String getBanco() {
        return conta.getBanco();
    }

    public String getAgencia() {
        return conta.getAgencia();
    }

    public String getNumero() {
        return conta.getNumero();
    }

    public int obterNumeroConta() {
        return conta.obterNumeroConta();
    }

    public void executarEm(ContaCorrente contaCorrente) {
        Operacao operacao = Operacao.values()[this.operacao];
        conta.executar(operacao, valor);
    }

}
