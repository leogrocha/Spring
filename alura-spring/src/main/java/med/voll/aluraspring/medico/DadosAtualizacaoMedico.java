package med.voll.aluraspring.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.aluraspring.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
    @NotNull Long id,
    String nome,
    String telefone,
    DadosEndereco endereco) {

}
