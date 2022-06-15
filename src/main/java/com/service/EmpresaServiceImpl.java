package com.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Empresa;
import com.repositories.EmpresaRepository;

@Service
public class EmpresaServiceImpl implements EmpresaService{
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Override
	@Transactional
	public Iterable<Empresa> findAll() {
		// TODO Auto-generated method stub
		return empresaRepository.findAll();
	}

	@Override
	@Transactional
	public Optional<Empresa> findById(Long id) {
		// TODO Auto-generated method stub
		return empresaRepository.findById(id);
	
	}

	@Override
	@Transactional
	public Empresa save(Empresa empresa) {
		// TODO Auto-generated method stub
		return empresaRepository.save(empresa	);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		empresaRepository.deleteById(id);
	}

}
