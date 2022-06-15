package com.service;

import java.util.Optional;

import com.model.Detalle;
import com.model.Dinamica;

public interface DinamicaService {

	public Iterable<Dinamica> findAll();
	public Optional<Dinamica> findById(Long id);
	public Dinamica save(Dinamica dinamica);
	public void deleteById(Long id);
	
}
