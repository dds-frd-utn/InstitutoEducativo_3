package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.entity.Temas;

public interface TemasRepository extends JpaRepository<Temas, Long> {

	
	void save(Optional<Temas> temasToUpdate);
	
	
	@Query(value = "select * from temas as t where t.nombre like :nombre", nativeQuery = true)  
	List<Temas> findLikeNombre(@Param("nombre")String nombre);
	
}
