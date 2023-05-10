package com.alura.alurabank.dominio;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Correntista {
    
    @JsonProperty
    private String cpf;

    @JsonProperty
    private String nome;

    private LocalDate dataDeEntrada = LocalDate.now();

    public LocalDate getDataDeEntrada() {
        return dataDeEntrada;
    }

    // public String getCpf() {
    //     return cpf;
    // }

    // public String getNome() {
    //     return nome;
    // }

}
