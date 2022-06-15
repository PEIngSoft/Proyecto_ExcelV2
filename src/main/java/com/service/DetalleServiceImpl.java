package com.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Detalle;
import com.model.Empresa;
import com.repositories.DetalleRepository;
import com.repositories.EmpresaRepository;

@Service
public class DetalleServiceImpl implements DetalleService{
	@Autowired
	private DetalleRepository detalleRepository;
	
	@Override
	@Transactional
	public Iterable<Detalle> findAll() {
		// TODO Auto-generated method stub
		return detalleRepository.findAll();
	}

	@Override
	@Transactional
	public Optional<Detalle> findById(Long id) {
		// TODO Auto-generated method stub
		return detalleRepository.findById(id);
	
	}

	@Override
	@Transactional
	public Detalle save(Detalle detalle) {
		// TODO Auto-generated method stub
		return detalleRepository.save(detalle);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		detalleRepository.deleteById(id);
	}

}
