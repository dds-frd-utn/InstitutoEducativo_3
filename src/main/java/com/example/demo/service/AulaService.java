package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Aula;


public interface AulaService {
	public List<Aula> findAllAula();

	public Optional<Aula> findAulaById(Long id);

	public Aula saveAula(Aula newAula);

	public String deleteAula(Long id);

	public String updateAula(Aula aula);

}
