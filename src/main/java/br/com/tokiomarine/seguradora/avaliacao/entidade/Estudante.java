package br.com.tokiomarine.seguradora.avaliacao.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
public class Estudante {
	
	@Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "Nome é obrigatório")
    private String name;

    @NotEmpty(message = "Email é obrigatório")
    private String author;

    private String telefone;

}
