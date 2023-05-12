package com.alura.alurabank.dominio;



import com.fasterxml.jackson.annotation.JsonProperty;

public class Correntista {
    
    @JsonProperty
    private String cpf;

    @JsonProperty
    private String nome;

    // private LocalDate dataDeEntrada = LocalDate.now();

    public Correntista(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    // public LocalDate getDataDeEntrada() {
    //     return dataDeEntrada;
    // }

    // public String getCpf() {
    //     return cpf;
    // }

    // public String getNome() {
    //     return nome;
    // }

}
