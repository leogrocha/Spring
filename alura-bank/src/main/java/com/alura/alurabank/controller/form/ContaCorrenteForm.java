package com.alura.alurabank.controller.form;

import com.alura.alurabank.dominio.ContaCorrente;
import com.alura.alurabank.dominio.Correntista;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaCorrenteForm {
    
    
    @JsonProperty
    @NotBlank(message = "Banco é um campo obrigatório e não pode estar em branco")
    private String banco;

    @JsonProperty
    @NotBlank(message = "Agência é um campo obrigatório e não pode estar estar em branco")
    private String agencia;

    @JsonProperty
    @NotBlank(message = "Número é um campo obrigatório e não pode estar em branco")
    private String numero;

    public ContaCorrente toContaCorrente() {
        return new ContaCorrente(banco, agencia, numero, new Correntista());
    }
}
