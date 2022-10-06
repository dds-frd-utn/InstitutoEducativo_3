package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TemasService;
import com.example.demo.entity.Temas;

@RestController 

public class TemasController {
	@Autowired	
	TemasService temasService;
	
	
	//Cuales son las condiciones para el request
	@RequestMapping(value = "/temas", method = RequestMethod.GET, produces = "application/json")
	
	public List<Temas> getTemas() {
		return temasService.findAllTemas();
	}

	@RequestMapping(value = "/temas/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Temas> getTemas(@PathVariable("id") Long id) {
		return temasService.findTemasById(id);
	}
	
	
	@RequestMapping(value = "/temas/add", method = RequestMethod.POST, produces = "application/json")
	public Temas addTemasTemas(Temas temas) {
		return temasService.saveTemas(temas);
	}

	@RequestMapping(value = "/temas/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public String deleteTemas(@PathVariable Long id) {
		return temasService.deleteTemas(id);
	}
	
	@RequestMapping(value = "/temas/update/{id}", method = RequestMethod.PUT, produces = "application/json")
	public String updateTemas(Temas temas) {
		return temasService.updateTemas(temas);
	}
}
