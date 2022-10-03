package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Aula;


public interface AulaRepository extends JpaRepository<Aula, Long> {

	void save(Optional<Aula> aulaToUpdate);

}
