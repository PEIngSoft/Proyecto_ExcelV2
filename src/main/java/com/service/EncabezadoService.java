package com.service;

import java.util.Optional;

import com.model.Detalle;
import com.model.Encabezado;

public interface EncabezadoService {

	public Iterable<Encabezado> findAll();
	public Optional<Encabezado> findById(Long id);
	public Encabezado save(Encabezado encabezado);
	public void deleteById(Long id);
	
}
