package com.service;

import java.util.Optional;

import com.model.Detalle;

public interface DetalleService {

	public Iterable<Detalle> findAll();
	public Optional<Detalle> findById(Long id);
	public Detalle save(Detalle detalle);
	public void deleteById(Long id);
	
}
