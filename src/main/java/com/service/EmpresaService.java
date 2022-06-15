package com.service;

import java.util.Optional;

import com.model.Empresa;

public interface EmpresaService {

	public Iterable<Empresa> findAll();
	public Optional<Empresa> findById(Long id);
	public Empresa save(Empresa empresa);
	public void deleteById(Long id);
	
}
