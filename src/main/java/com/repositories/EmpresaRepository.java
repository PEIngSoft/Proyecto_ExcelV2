package com.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Empresa;
@Repository
public interface EmpresaRepository extends CrudRepository<Empresa,Long>{

	
}
