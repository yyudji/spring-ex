package br.com.smu.springcrudex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@SpringBootApplication
public class SpringCrudExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudExApplication.class, args);
	}
	@GetMapping("/user/{id}")
    public String encontrarUsuario() {
        return "Usuario encontrado";
    }
	
	@PostMapping("/user")
    public String adicionarUsuario() {
        return "Usuario adicionado";
    }
	
	@DeleteMapping("/user/{id}")
    public String deletarUsuario() {
        return "Usuario deletado";
    }
	
	@PutMapping("/user/{id}")
    public String atualizarUsuario() {
        return "Usuario atualizado";
    }
}
