package com.alura.alurabank.dominio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
public class MovimentacaoDeConta {
    
    @Getter
    @JsonProperty
    private ContaCorrente conta;

    @JsonProperty
    private BigDecimal valor;
    
    @JsonProperty
    private int operacao;

    public int obterNumeroConta() {
        return conta.obterNumeroConta();
    }

    public void executarEm(ContaCorrente contaCorrente) {
        Operacao operacao = Operacao.values()[this.operacao];
        conta.executar(operacao, valor);
    }

}
