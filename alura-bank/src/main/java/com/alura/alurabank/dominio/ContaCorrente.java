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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((banco == null) ? 0 : banco.hashCode());
        result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ContaCorrente other = (ContaCorrente) obj;
        if (banco == null) {
            if (other.banco != null)
                return false;
        } else if (!banco.equals(other.banco))
            return false;
        if (agencia == null) {
            if (other.agencia != null)
                return false;
        } else if (!agencia.equals(other.agencia))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        return true;
    }

    
    

    
}
