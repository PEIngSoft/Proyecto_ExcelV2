package com.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Detalle;
import com.model.Dinamica;
import com.model.Empresa;
@Repository
public interface DinamicaRepository extends CrudRepository<Dinamica,Long>{

	
}
