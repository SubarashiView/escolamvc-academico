package br.senai.sp.escolamvc.Repository;

import br.senai.sp.escolamvc.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AlunoRepository extends JpaRepository<Aluno,Long> {
}