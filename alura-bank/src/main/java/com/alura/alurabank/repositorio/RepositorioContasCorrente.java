package com.alura.alurabank.repositorio;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.alura.alurabank.dominio.ContaCorrente;

@Repository
public class RepositorioContasCorrente {

    private Set<ContaCorrente> contas;

    public RepositorioContasCorrente() {
        contas = new HashSet<>();
    }

    public void salvar(ContaCorrente conta) {
        contas.add(conta);
    }

    public Optional<ContaCorrente> buscar(String banco, String agencia, String numero) {
        return contas.stream()
                .filter(contaCorrente -> contaCorrente.identificadaPor(banco, agencia, numero))
                .findFirst();
    }

    public void fechar(ContaCorrente contaCorrente) {
        contas.remove(contaCorrente);
    }

}
