package br.com.smu.investimento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity(name = "endereco")
@SequenceGenerator(name="id_endereco", sequenceName = "sq_investidor", allocationSize = 1)
public class Endereco {
	
	@Id
	@GeneratedValue(generator = "id_endereco", strategy = GenerationType.SEQUENCE)
	private String id;
	
	private String cep;
	
	private String rua;
	
	private String complemento;
	
	private String numero;
	
	private String bairro;

}
