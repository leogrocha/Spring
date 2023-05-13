package com.alura.alurabank.controller.form;

import org.hibernate.validator.constraints.br.CPF;

import com.alura.alurabank.dominio.Correntista;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CorrentistaForm {
    
    @JsonProperty
    @CPF(message = "CPF inválido")
    @NotNull(message =  "CPF é um campo obrigatório")
    private String cpf;
    
    @JsonProperty
    // @NotNull(message = "Nome do correntista não pode ser nulo.")
    @NotBlank(message = "Nome é um campo obrigatório e não pode ser vazio.")
    private String nome;

    public Correntista toCorrentista() {
        return new Correntista(cpf, nome);
    }
}
