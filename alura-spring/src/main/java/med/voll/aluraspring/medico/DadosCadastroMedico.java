package med.voll.aluraspring.medico;

import med.voll.aluraspring.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
    
}
