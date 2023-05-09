package com.alura.alurabank.dominio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContaCorrente {
    
    @JsonProperty
    private String banco;

    @JsonProperty
    private String agencia;

    @JsonProperty
    private String numero;

    @JsonProperty
    private BigDecimal saldo;

    @JsonProperty
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

    public String getBanco() {
        return banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }
}
