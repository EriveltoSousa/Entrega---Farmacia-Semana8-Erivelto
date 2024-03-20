package br.com.alura.farmaciaSemana8Turma02.repository;

import br.com.alura.farmaciaSemana8Turma02.model.Fabricaante;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

 public interface FabricanteRepository extends CrudRepository<Fabricaante, Integer> {

}
