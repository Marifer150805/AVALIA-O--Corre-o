package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Aluno;

public interface AlunoRepository extends JpaRepository<AlunoRepository, Long> {
	//Query Methods
	List<AlunoRepository> findByCidade(String cidade);
	AlunoRepository findByRa(String ra);

}