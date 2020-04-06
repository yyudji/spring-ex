package br.com.smu.investimento;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity(name="investidor")
@SequenceGenerator(name="id_investidor", sequenceName = "sq_investidor", allocationSize = 1)
public class Investidor {
	
	//@GeneratedValue = Especifica a estratégia de geração de valores automáticos para os atributos
		@Id
		@GeneratedValue(generator = "id_investidor", strategy = GenerationType.SEQUENCE)
		private String id;
		
		private String nome;
		
		private String email;
		
		private String cpf;
		
		
		//CascadeType = Indica quando uma alteração na entidade pai será propagara para as entidades filhas
		//CascadeType.PERSIST = somente operação de persist será refletida
		//@JoinColumn = adiciona uma coluna na tabela
		@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
		private Endereco endereco;
		
		//mappedBy = indica o nome do atributo que mapeia aassociação do que mapeia a
		//associação do lado dono da chave estrangeira 
		@OneToMany(mappedBy = "investidor", cascade =  {CascadeType.PERSIST, CascadeType.MERGE})
		private List <Declaracao> declaracoes = new ArrayList<Declaracao>();
}
