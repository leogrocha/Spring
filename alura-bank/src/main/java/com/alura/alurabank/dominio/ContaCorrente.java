package com.alura.alurabank.dominio;

import java.math.BigDecimal;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(of = { "banco", "agencia", "numero" })
public class ContaCorrente {

    @Getter
    @Setter
    @JsonProperty
    private String banco;

    @Getter
    @Setter
    @JsonProperty
    private String agencia;

    @Getter
    @Setter
    @JsonProperty
    private String numero;

    @JsonProperty
    private BigDecimal saldo;
    
    @JsonProperty
    @Getter
    private Correntista correntista;

    public ContaCorrente(String banco, String agencia, String numero, Correntista correntista) {
        this(); // aproveitando e retornando os mesmos dados do construtor vazio.
        this.banco = banco;
        this.agencia = agencia;
        this.numero = numero;
        this.correntista = correntista;
    }
    
    public ContaCorrente() {
        this.saldo = BigDecimal.ZERO;
    }

    public int obterNumeroConta() {
        return Integer.parseInt(numero);
    }

    public boolean identificadaPor(String banco, String agencia, String numero) {
        return this.banco.equals(banco)
            && this.agencia.equals(agencia)
            && this.numero.equals(numero);
    }

    public BigDecimal lerSaldo() {
        return saldo;
    }


    public void executar(Operacao operacao, BigDecimal valor) {
        saldo = operacao.executar(saldo, valor);
    }    

    
}
