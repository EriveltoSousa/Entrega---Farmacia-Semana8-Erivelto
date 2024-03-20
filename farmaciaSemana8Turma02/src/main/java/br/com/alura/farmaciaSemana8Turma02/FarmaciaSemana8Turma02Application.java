package br.com.alura.farmaciaSemana8Turma02;

import br.com.alura.farmaciaSemana8Turma02.Principal.Principal;
import br.com.alura.farmaciaSemana8Turma02.repository.FabricanteRepository;
import br.com.alura.farmaciaSemana8Turma02.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FarmaciaSemana8Turma02Application implements CommandLineRunner {

	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private FabricanteRepository fabricanteRepository;

	public static void main(String[] args) {
		SpringApplication.run(FarmaciaSemana8Turma02Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(produtoRepository, fabricanteRepository);
		principal.exibeMenu();

	}
}
