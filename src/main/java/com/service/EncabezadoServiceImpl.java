package com.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Detalle;
import com.model.Empresa;
import com.model.Encabezado;
import com.repositories.DetalleRepository;
import com.repositories.EmpresaRepository;
import com.repositories.EncabezadoRepository;

@Service
public class EncabezadoServiceImpl implements EncabezadoService{
	@Autowired
	private EncabezadoRepository encabezadoRepository;
	
	@Override
	@Transactional
	public Iterable<Encabezado> findAll() {
		// TODO Auto-generated method stub
		return encabezadoRepository.findAll();
	}

	@Override
	@Transactional
	public Optional<Encabezado> findById(Long id) {
		// TODO Auto-generated method stub
		return encabezadoRepository.findById(id);
	
	}

	@Override
	@Transactional
	public Encabezado save(Encabezado encabezado) {
		// TODO Auto-generated method stub
		return encabezadoRepository.save(encabezado);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		encabezadoRepository.deleteById(id);
	}

}
