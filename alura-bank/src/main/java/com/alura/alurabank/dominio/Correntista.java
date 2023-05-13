package com.alura.alurabank.dominio;



import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Correntista {
    
    @JsonProperty
    private String cpf;

    @JsonProperty
    private String nome;

    // private LocalDate dataDeEntrada = LocalDate.now();
}
