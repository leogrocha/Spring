package med.voll.aluraspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.aluraspring.medico.DadosCadastroMedico;
import med.voll.aluraspring.medico.Medico;
import med.voll.aluraspring.medico.MedicoRepository;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;
    
    @PostMapping
    @Transactional
    public void cadastar(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }


}
