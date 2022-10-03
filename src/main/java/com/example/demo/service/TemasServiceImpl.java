package com.example.demo.service;

//Este archivo lo que va a permitir es la implementacion de la interfaz PostService
//Hacerlo de esta manera me permite poder agregar funcionalidades facilmente

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Temas;
import com.example.demo.repository.TemasRepository;

@Service
public class TemasServiceImpl implements TemasService {

	@Autowired
	TemasRepository temasRepository; 
	@Override
	public List<Temas> findAllTemas() {
		return temasRepository.findAll();
	}

	@Override
	public Optional<Temas> findTemasById(Long id) {
		
		return temasRepository.findById(id);
	}

	@Override
	public Temas saveTemas(Temas newTemas) {
		
		return temasRepository.save(newTemas);
	}

	@Override
	public String deleteTemas(Long id) {
		if (temasRepository.findById(id) != null) {
			temasRepository.deleteById(id);
			return "OK";
		}
		
		return "ERROR: el id no existe";
	}

	@Override
	public String updateTemas(Temas temas) {
	
		if (temasRepository.findById(temas.getId()) != null) {
			temasRepository.save(temas);
			return "OK";
		}

		return "ERROR: el id no existe";
	}

	@Override
	public List<Temas> findLikeNombre(String nombre) {
		return temasRepository.findLikeNombre(nombre);
	}


}
