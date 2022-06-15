package com.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Detalle;
import com.model.Dinamica;
import com.model.Empresa;
import com.repositories.DetalleRepository;
import com.repositories.DinamicaRepository;
import com.repositories.EmpresaRepository;

@Service
public class DinamicaServiceImpl implements DinamicaService{
	@Autowired
	private DinamicaRepository dinamicaRepository;
	
	@Override
	@Transactional
	public Iterable<Dinamica> findAll() {
		// TODO Auto-generated method stub
		return dinamicaRepository.findAll();
	}

	@Override
	@Transactional
	public Optional<Dinamica> findById(Long id) {
		// TODO Auto-generated method stub
		return dinamicaRepository.findById(id);
	
	}

	@Override
	@Transactional
	public Dinamica save(Dinamica dinamica) {
		// TODO Auto-generated method stub
		return dinamicaRepository.save(dinamica);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		dinamicaRepository.deleteById(id);
	}

}
