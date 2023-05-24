package med.voll.aluraspring.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
    }


    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public void atualizarInformacoes(DadosEndereco dados) {
        this.logradouro = dados.logradouro() == null ? getLogradouro() : dados.logradouro();
        this.bairro = dados.bairro() == null ? getBairro() : dados.bairro();
        this.cep = dados.cep() == null ? getCep() : dados.cep();
        this.numero = dados.numero() == null ? getNumero() : dados.numero();
        this.complemento = dados.complemento() == null ? getComplemento() : dados.complemento();
        this.cidade = dados.cidade() == null ? getCidade() : dados.cidade();
        this.uf = dados.uf() == null ? getUf() : dados.uf();
    }
}
