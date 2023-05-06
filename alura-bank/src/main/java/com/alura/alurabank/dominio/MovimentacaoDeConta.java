package com.alura.alurabank.dominio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovimentacaoDeConta {
    
    @JsonProperty
    private ContaCorrente conta;

    @JsonProperty
    private BigDecimal valor;
    
    @JsonProperty
    private Operacao operacao;

}
