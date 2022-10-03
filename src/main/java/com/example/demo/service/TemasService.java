package com.example.demo.service;
//Aca es donde se va a indicar de que manera nuestro servicio va a funcionar

//Cuales son los metodos que nuestro servicio va a tener (van a estar definidos en la clase)

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Temas;

public interface TemasService {
	public List<Temas> findAllTemas();

	public Optional<Temas> findTemasById(Long id);

	public Temas saveTemas(Temas newTemas);

	public String deleteTemas(Long id);

	public String updateTemas(Temas temas);

	public List<Temas> findLikeNombre(String nombre);

}
