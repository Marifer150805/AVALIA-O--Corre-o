package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Turma;

public interface TurmaRepository extends JpaRepository<TurmaRepository, Long> {
	
}