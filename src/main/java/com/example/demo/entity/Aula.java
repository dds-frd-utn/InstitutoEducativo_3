package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity 
@Table(name = "aulas") 
public class Aula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id") 
	Long id;
	@Column(name = "codigo")
	String codigo;
	@Column(name = "capacidad")
	Integer capacidad;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

}
