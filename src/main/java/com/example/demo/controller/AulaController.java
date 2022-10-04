package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AulaService;
import com.example.demo.entity.Aula;

@RestController 

public class AulaController {
	@Autowired	
	AulaService aulaService;
	
	@RequestMapping(value = "/aulas", method = RequestMethod.GET, produces = "application/json")
	public List<Aula> getAula() {
		return aulaService.findAllAula();
	}
	
	@RequestMapping(value = "/aulas/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Aula> getAula(@PathVariable Long id) {
		return aulaService.findAulaById(id);
	}
	
	@RequestMapping(value = "/aulas/add", method = RequestMethod.POST, produces = "application/json")
	public Aula addAula(Aula aula) {
		return aulaService.saveAula(aula);
	}

	@RequestMapping(value = "/aulas/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public String deleteAula(@PathVariable Long id) {
		return aulaService.deleteAula(id);
	}
	
	@RequestMapping(value = "/aulas/update/{id}", method = RequestMethod.PUT, produces = "application/json")
	public String updatePost(Aula aula) {
		return aulaService.updateAula(aula);
	}
}
