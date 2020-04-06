package br.com.smu.investimento;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;

//Define a entidade Declaracao(mesmo nome da classe)
//Nome da sequence criada
//allocationSize = valor de incremento na sequence
@Data
@Entity(name = "declaracao")
@SequenceGenerator(name="id_declaracao", sequenceName = "sq_investidor", allocationSize = 1)
public class Declaracao {
	@Id
	@GeneratedValue(generator = "id_declaracao", strategy = GenerationType.SEQUENCE)
	private String id;
	
	private String ip;
	
	private String userAgent;
	
	private boolean assinado;

	private LocalDateTime data;
	
	@ManyToOne
	@JoinColumn(name="id_investidor")
	private Investidor investidor;
}
