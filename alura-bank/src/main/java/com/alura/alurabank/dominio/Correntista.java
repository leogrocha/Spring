package com.alura.alurabank.dominio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Correntista {
    
    @JsonProperty
    private String cpf;

    @JsonProperty
    private String nome;
    
    // public String getCpf() {
    //     return cpf;
    // }

    // public String getNome() {
    //     return nome;
    // }

}
