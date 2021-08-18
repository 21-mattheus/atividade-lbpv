package br.edu.cesmac.si.atividade.repository;
import br.edu.cesmac.si.atividade.model.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
