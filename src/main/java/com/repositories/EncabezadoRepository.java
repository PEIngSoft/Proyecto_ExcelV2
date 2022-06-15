package com.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Detalle;
import com.model.Empresa;
import com.model.Encabezado;
@Repository
public interface EncabezadoRepository extends CrudRepository<Encabezado,Long>{

	
}
