package com.alura.alurabank.controller;

import java.util.Optional;
import java.util.Random;

// import org.springframework.beans.factory.annotation.Autowired;
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

// import com.alura.alurabank.controller.form.ContaCorrenteForm;
import com.alura.alurabank.controller.form.CorrentistaForm;
import com.alura.alurabank.dominio.ContaCorrente;
import com.alura.alurabank.dominio.Correntista;
import com.alura.alurabank.dominio.MovimentacaoDeConta;
import com.alura.alurabank.repositorio.RepositorioContasCorrente;
// import com.googlecode.jmapper.JMapper;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/contas")
@AllArgsConstructor
public class ContaCorrenteController {

    
    private RepositorioContasCorrente repositorioContasCorrente;

    // @Autowired
    // private JMapper<ContaCorrente, ContaCorrenteForm> contaCorrenteMapper;

    @GetMapping
    public String consultarSaldo(
            @RequestParam(name = "banco") String banco,
            @RequestParam(name = "agencia") String agencia,
            @RequestParam(name = "numero") String numero) {

        ContaCorrente contaCorrente = repositorioContasCorrente
                .buscar(banco, agencia, numero)
                .orElse(new ContaCorrente());

        return String.format("Banco: %s, Agência: %s, Conta: %s Saldo: %s", banco, agencia, numero,
                contaCorrente.lerSaldo());
    }

    @PostMapping
    public ResponseEntity<ContaCorrente> criarNovaConta(@RequestBody CorrentistaForm correntistaForm) {
        Correntista correntista = correntistaForm.toCorrentista();
        String banco = "333";
        String agencia = "44444";
        String numero = Integer.toString(new Random().nextInt(Integer.MAX_VALUE));

        ContaCorrente conta = new ContaCorrente(banco, agencia, numero, correntista);
        repositorioContasCorrente.salvar(conta);

        return ResponseEntity.status(HttpStatus.CREATED).body(conta);
    }

    @DeleteMapping
    public String fecharConta(@RequestBody ContaCorrente contaCorrente) {
        
        Optional<ContaCorrente> opContaCorrente = repositorioContasCorrente.buscar(contaCorrente.getBanco(),
        contaCorrente.getAgencia(),
        contaCorrente.getNumero());
        if (opContaCorrente.isEmpty()) {
            return "Conta corrente não existe";
        }

        // ContaCorrente conta = contaCorrenteMapper.getDestination(contaCorrenteForm);
        
        repositorioContasCorrente.fechar(contaCorrente);
        return "Conta fechada com sucesso";
    }

    @PutMapping
    public ResponseEntity<String> movimentarConta(@RequestBody MovimentacaoDeConta movimentacaoDeConta) {

        System.out.println(movimentacaoDeConta);

        Optional<ContaCorrente> opContaCorrente = repositorioContasCorrente.buscar(
                movimentacaoDeConta.getConta().getBanco(),
                movimentacaoDeConta.getConta().getAgencia(),
                movimentacaoDeConta.getConta().getNumero());
        if (opContaCorrente.isEmpty()) {
            return ResponseEntity.badRequest().body("Conta corrente não existe");
        } else {
            ContaCorrente contaCorrente = opContaCorrente.get();
            movimentacaoDeConta.executarEm(contaCorrente);
            repositorioContasCorrente.salvar(contaCorrente);
            return ResponseEntity.ok("Movimentação realizada com sucesso. " + contaCorrente.lerSaldo());
        }

    }
}
