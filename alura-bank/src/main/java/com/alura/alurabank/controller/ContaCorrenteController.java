package com.alura.alurabank.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alura.alurabank.dominio.ContaCorrente;
import com.alura.alurabank.dominio.Correntista;
import com.alura.alurabank.dominio.MovimentacaoDeConta;

@RestController @RequestMapping("/contas")
public class ContaCorrenteController {
    
    @GetMapping
    public String consultarSaldo(
            @RequestParam(name = "banco") String banco,
            @RequestParam(name = "agencia") String agencia,
            @RequestParam(name = "numero") String numero) {
        return String.format("Banco: %s, Agência: %s, Conta: %s. Saldo: R$1300,00", banco, agencia, numero);
    }

    @PostMapping
    public ResponseEntity<ContaCorrente> criarNovaConta(@RequestBody Correntista correntista) {
        ContaCorrente conta = new ContaCorrente("111", "0153", "13");

        return ResponseEntity.status(HttpStatus.CREATED).body(conta);
    }

    @DeleteMapping
    public String fecharConta(@RequestBody ContaCorrente contaCorrente) {
        return "Conta fechada com sucesso";
    }

    @PutMapping
    public ResponseEntity<MovimentacaoDeConta> movimentarConta(@RequestBody MovimentacaoDeConta movimentacaoDeConta) {
        return ResponseEntity.ok(movimentacaoDeConta);
    }
}
